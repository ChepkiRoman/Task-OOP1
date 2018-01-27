package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.List;

public class OvenBuilder implements ApplianceBuilder {

    @Override
    public <E> Appliance buildAppliance(List<String> criteriaList) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Double.parseDouble(criteriaList.get(0)));
        oven.setWeight(Double.parseDouble(criteriaList.get(1)));
        oven.setCapacity(Double.parseDouble(criteriaList.get(2)));
        oven.setDepth(Double.parseDouble(criteriaList.get(3)));
        oven.setHeight(Double.parseDouble(criteriaList.get(4)));
        oven.setWidth(Double.parseDouble(criteriaList.get(5)));

        return oven;
    }
}
