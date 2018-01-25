package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by RomanChepki on 25.01.18.
 */
public class TabletPCBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(Criteria<E> criteria) {
        TabletPC tabletPC = new TabletPC();

            if(criteria.getCriteria().get(SearchCriteria.TabletPC.BATTERY_CAPACITY)!= null){
                tabletPC.setBatteryCapacity(Integer.parseInt
                        (criteria.getCriteria().get(SearchCriteria.TabletPC.BATTERY_CAPACITY).toString()));
            }
        if(criteria.getCriteria().get(SearchCriteria.TabletPC.DISPLAY_INCHES)!= null){
            tabletPC.setDisplayInches(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.TabletPC.DISPLAY_INCHES).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.TabletPC.MEMORY_ROM)!= null){
            tabletPC.setMemoryRom(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.TabletPC.MEMORY_ROM).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY)!= null){
            tabletPC.setFlashMemoryCapacity(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.TabletPC.COLOR)!= null){
            tabletPC.setColor(criteria.getCriteria().get(SearchCriteria.TabletPC.COLOR).toString());
        }
        return tabletPC;
    }
}
