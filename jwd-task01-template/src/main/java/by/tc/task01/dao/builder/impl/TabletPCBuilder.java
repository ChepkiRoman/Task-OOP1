package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.List;


public class TabletPCBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(List<String> criteriaList) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Double.parseDouble(criteriaList.get(0)));
        tabletPC.setDisplayInches(Double.parseDouble(criteriaList.get(1)));
        tabletPC.setMemoryRom(Double.parseDouble(criteriaList.get(2)));
        tabletPC.setFlashMemoryCapacity(Double.parseDouble(criteriaList.get(3)));
        tabletPC.setColor(criteriaList.get(4));
        return tabletPC;
    }
}
