package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class OvenBuilder implements ApplianceBuilder {

    @Override
    public <E> Appliance buildAppliance(Criteria<E> criteria) {
        Oven oven = new Oven();
        if(criteria.getCriteria().get(SearchCriteria.Oven.POWER_CONSUMPTION)!= null){
            oven.setPowerConsumption(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Oven.POWER_CONSUMPTION).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Oven.WEIGHT)!= null){
            oven.setWeight(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Oven.WEIGHT).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Oven.CAPACITY)!= null){
            oven.setCapacity(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Oven.CAPACITY).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Oven.DEPTH)!= null){
            oven.setDepth(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Oven.DEPTH).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Oven.HEIGHT)!= null){
            oven.setHeight(Double.parseDouble
                    (criteria.getCriteria().get(SearchCriteria.Oven.HEIGHT).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Oven.WIDTH)!= null){
            oven.setWidth(Double.parseDouble
                    (criteria.getCriteria().get(SearchCriteria.Oven.WIDTH).toString()));
        }
        return oven;
    }
}
