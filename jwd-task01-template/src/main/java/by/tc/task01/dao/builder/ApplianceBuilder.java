package by.tc.task01.dao.builder;

import by.tc.task01.entity.Appliance;

import java.util.List;


public interface ApplianceBuilder {
    <E> Appliance buildAppliance(List<String> obj);
}
