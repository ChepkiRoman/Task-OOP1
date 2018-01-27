package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.dao.builder.ApplianceDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {


    ApplianceDirector applianceDirector = new ApplianceDirector();
    FileLoaderImpl file = new FileLoaderImpl();
    BufferedReader reader;

    @Override
    public <E> Appliance find(Criteria<E> criteria) throws IOException {
        try {
            String line;
            reader = new BufferedReader(new FileReader(file.loadFile()));
            int matchedCriteriasCount = 0;
            while ((line = reader.readLine()) != null) {
                if (line.contains(criteria.getApplianceType())) {
                    {
                        for (String compareCriteria : criteria.getStringCriteria()) {
                            if (line.contains(compareCriteria + ',') || line.contains(compareCriteria + ';')) {
                                matchedCriteriasCount++;
                            }
                        }
                        if (matchedCriteriasCount == criteria.getStringCriteria().size()) {
                            List<String> criteriaList = parseAppliance(line);
                            ApplianceBuilder command = applianceDirector.getPreparedAppliance(criteria.getApplianceType());
                            Appliance appliance = command.buildAppliance(criteriaList);
                            return appliance;
                        }
                    }
                }
            }

            return null;

        } finally {
            reader.close();
        }


    }

    private List<String> parseAppliance(String line) {
        List<String> criterias = new ArrayList<String>();
        for (String str : line.split(";")[0].split(",")) {
            criterias.add(str.split("=")[1]);
        }
        return criterias;

    }


}



