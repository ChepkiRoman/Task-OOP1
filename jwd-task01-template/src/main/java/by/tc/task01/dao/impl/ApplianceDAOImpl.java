package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

import static by.tc.task01.dao.creator.ApplianceCreator.creator;

public class ApplianceDAOImpl implements ApplianceDAO {
    private String FILE_PATH = "/Users/RomanChepki/Downloads/JWD_Task01_OOP-master-2/jwd-task01-template/src/main/resources/appliances_db.txt";


    @Override
    public <E> Appliance find(Criteria<E> criteria) throws IOException {
        Map<E, Object> criteriaMap = new HashMap<E, Object>();
        criteriaMap = criteria.getCriteria();
        Set<Map.Entry<E, Object>> setCriteria = criteriaMap.entrySet();

        File file = new File(FILE_PATH);
        Scanner scanner = new Scanner(file);
        boolean flag = true;
        String line;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            if (line.contains(criteria.getApplianceType())) {
                for (Map.Entry<E, Object> userCriteria : setCriteria) {
                    if ((line.contains(userCriteria.getKey() + "=" + userCriteria.getValue() + ",")) || (line.contains(userCriteria.getKey() + "=" + userCriteria.getValue() + ";"))) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    List initializationList = parser(line);
                    Appliance appliance = creator(initializationList, criteria.getApplianceType());
                    return appliance;
                }
            }

        }
        if (!flag) {
            return null;
        }
        return null;
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



