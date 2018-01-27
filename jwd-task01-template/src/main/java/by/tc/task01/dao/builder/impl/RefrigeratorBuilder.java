package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.List;


public class RefrigeratorBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(List<String> criteriaList) {

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Double.parseDouble(criteriaList.get(0)));
        refrigerator.setWeight(Double.parseDouble(criteriaList.get(1)));
        refrigerator.setFreezerCapacity(Double.parseDouble(criteriaList.get(2)));
        refrigerator.setOverallCapacity(Double.parseDouble(criteriaList.get(3)));
        refrigerator.setHeight(Double.parseDouble(criteriaList.get(4)));
        refrigerator.setWidth(Double.parseDouble(criteriaList.get(5)));
        return refrigerator;
    }
}
