package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.List;


public class VacuumCleanerBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(List<String> criteriaList) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Double.parseDouble(criteriaList.get(0)));
        vacuumCleaner.setFilterType(criteriaList.get(1));
        vacuumCleaner.setBagType(criteriaList.get(2));
        vacuumCleaner.setWandType(criteriaList.get(3));
        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(criteriaList.get(4)));
        vacuumCleaner.setCleaningWidth(Double.parseDouble(criteriaList.get(5)));


        return vacuumCleaner;
    }
}
