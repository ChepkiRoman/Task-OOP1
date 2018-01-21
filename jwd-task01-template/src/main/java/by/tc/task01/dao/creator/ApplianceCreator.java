package by.tc.task01.dao.creator;


import by.tc.task01.entity.*;

import java.util.List;

public class ApplianceCreator {
    public static Appliance creator(List<String> initializationList, String applianceType) {
        Appliance appliance = new Appliance();
        switch (applianceType) {
            case "Oven":
                appliance = ovenCreator(initializationList);
                break;
            case "Laptop":
                appliance = laptopCreator(initializationList);
                break;
            case "Refrigerator":
                appliance = refrigeratorCreator(initializationList);
                break;
            case "VacuumCleaner":
                appliance = vacuumCleanerCreator(initializationList);
                break;
            case "TabletPC":
                appliance = tabletPCCreator(initializationList);
                break;
            case "Speakers":
                appliance = speakersCreator(initializationList);
                break;
        }
        return appliance;
    }

    public static Appliance ovenCreator(List<String> initializationList) {
        Oven oven = new Oven();
        oven.setPowerConsumption(Integer.parseInt(initializationList.get(0)));
        oven.setWeight(Integer.parseInt(initializationList.get(1)));
        oven.setCapacity(Integer.parseInt(initializationList.get(2)));
        oven.setDepth(Integer.parseInt(initializationList.get(3)));
        oven.setHeight(Double.parseDouble(initializationList.get(4)));
        oven.setWidth(Double.parseDouble(initializationList.get(5)));
        return oven;
    }

    public static Appliance laptopCreator(List<String> initializationList) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Integer.parseInt(initializationList.get(0)));
        laptop.setOs(initializationList.get(1));
        laptop.setMemoryRom(Integer.parseInt(initializationList.get(2)));
        laptop.setSystemMemory(Integer.parseInt(initializationList.get(3)));
        laptop.setCpu(Double.parseDouble(initializationList.get(4)));
        laptop.setDisplayInches(Integer.parseInt(initializationList.get(5)));
        return laptop;
    }

    public static Appliance refrigeratorCreator(List<String> initializationList) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setPowerConsumption(Integer.parseInt(initializationList.get(0)));
        refrigerator.setWeight(Integer.parseInt(initializationList.get(1)));
        refrigerator.setFreezerCapacity(Integer.parseInt(initializationList.get(2)));
        refrigerator.setOverallCapacity(Double.parseDouble(initializationList.get(3)));
        refrigerator.setHeight(Integer.parseInt(initializationList.get(4)));
        refrigerator.setWidth(Integer.parseInt(initializationList.get(5)));
        return refrigerator;
    }

    public static Appliance vacuumCleanerCreator(List<String> initializationList) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt(initializationList.get(0)));
        vacuumCleaner.setFilterType(initializationList.get(1));
        vacuumCleaner.setBagType(initializationList.get(2));
        vacuumCleaner.setWandType(initializationList.get(3));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(initializationList.get(4)));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(initializationList.get(5)));
        return vacuumCleaner;
    }

    public static Appliance tabletPCCreator(List<String> initializationList) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Integer.parseInt(initializationList.get(0)));
        tabletPC.setDisplayInches(Integer.parseInt(initializationList.get(1)));
        tabletPC.setMemoryRom(Integer.parseInt(initializationList.get(2)));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(initializationList.get(3)));
        tabletPC.setColor(initializationList.get(4));
        return tabletPC;
    }

    public static Appliance speakersCreator(List<String> initializationList) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Integer.parseInt(initializationList.get(0)));
        speakers.setNumberOfSpeakers(Integer.parseInt(initializationList.get(1)));
        speakers.setFrequencyRange(initializationList.get(2));
        speakers.setCordLength(Integer.parseInt(initializationList.get(3)));
        return speakers;
    }
}
