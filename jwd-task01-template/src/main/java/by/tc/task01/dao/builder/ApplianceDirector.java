package by.tc.task01.dao.builder;

import by.tc.task01.dao.builder.impl.*;

import java.util.HashMap;
import java.util.Map;

public  class ApplianceDirector {
    Map<String, ApplianceBuilder> appliancesMap = new HashMap<>();

    public ApplianceDirector() {
        appliancesMap.put("Oven", new OvenBuilder());
        appliancesMap.put("Laptop", new LaptopBuilder());
        appliancesMap.put("Refrigerator", new LaptopBuilder());
        appliancesMap.put("VacuumCleaner", new VacuumCleanerBuilder());
        appliancesMap.put("TabletPC", new TabletPCBuilder());
        appliancesMap.put("Speakers", new SpeakersBuilder());
    }

    public ApplianceBuilder getPreparedAppliance(String ApplianceName){
        return appliancesMap.get(ApplianceName);
    }
}
