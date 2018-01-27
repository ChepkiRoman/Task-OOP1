package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.List;


public class LaptopBuilder implements ApplianceBuilder {

    @Override
    public <E> Appliance buildAppliance(List<String> criteriaList) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Double.parseDouble(criteriaList.get(0)));
        laptop.setOs(criteriaList.get(1));
        laptop.setMemoryRom(Double.parseDouble(criteriaList.get(2)));
        laptop.setSystemMemory(Double.parseDouble(criteriaList.get(3)));
        laptop.setCpu(Double.parseDouble(criteriaList.get(4)));
        laptop.setDisplayInches(Double.parseDouble(criteriaList.get(5)));
        return laptop;
    }
}
