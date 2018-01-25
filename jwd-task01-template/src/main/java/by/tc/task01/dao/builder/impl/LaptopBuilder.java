package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by RomanChepki on 25.01.18.
 */
public class LaptopBuilder implements ApplianceBuilder {

    @Override
    public <E> Appliance buildAppliance(Criteria<E> criteria) {
        Laptop laptop = new Laptop();
        if(criteria.getCriteria().get(SearchCriteria.Laptop.BATTERY_CAPACITY)!= null){
            laptop.setBatteryCapacity(Double.parseDouble
                    (criteria.getCriteria().get(SearchCriteria.Laptop.BATTERY_CAPACITY).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Laptop.OS)!= null){
            laptop.setOs(criteria.getCriteria().get(SearchCriteria.Laptop.OS).toString());
        }
        if(criteria.getCriteria().get(SearchCriteria.Laptop.MEMORY_ROM)!= null){
            laptop.setMemoryRom(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Laptop.MEMORY_ROM).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Laptop.SYSTEM_MEMORY)!= null){
            laptop.setSystemMemory(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Laptop.SYSTEM_MEMORY).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Laptop.CPU)!= null){
            laptop.setCpu(Double.parseDouble
                    (criteria.getCriteria().get(SearchCriteria.Laptop.CPU).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Laptop.DISPLAY_INCHES)!= null){
            laptop.setDisplayInches(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Laptop.DISPLAY_INCHES).toString()));
        }
        return laptop;
    }
}
