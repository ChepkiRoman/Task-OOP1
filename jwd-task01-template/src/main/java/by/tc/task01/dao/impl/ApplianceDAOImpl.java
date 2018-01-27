package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.SourceApplianceReader;
import by.tc.task01.dao.builder.ApplianceDirector;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {


    ApplianceDirector applianceDirector = new ApplianceDirector();

    @Override
    public <E> Appliance find(Criteria<E> criteria) throws IOException {

        if (check(criteria)) {
            return applianceDirector.getPreparedAppliance(criteria.getApplianceType()).buildAppliance(criteria);
        }

        return null;
    }


    private <E> Boolean check(Criteria<E> criteria) throws IOException {
        SourceApplianceReader sourceApplianceReader = new SourceApplianceReader();
        String request;
        for (Map.Entry<E, Object> entry : criteria.getCriteria().entrySet()) {
            request = entry.getKey() + "=" + entry.getValue();
            if (!sourceApplianceReader.readFromFile(criteria.getApplianceType(), request)) {
                return false;
            }
        }
        return true;
    }


    public List<String> parser(String line) {
        String[] buffer = line.split("[^0-9a-zA-Z-?_?.?]+");
        List<String> list = new ArrayList<>();
        for (int i = 2; i < buffer.length; i += 2) {
            list.add(buffer[i]);
        }
        return list;
    }


}



