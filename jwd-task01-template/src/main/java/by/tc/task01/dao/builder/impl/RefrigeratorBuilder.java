package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by RomanChepki on 25.01.18.
 */
public class RefrigeratorBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(Criteria<E> criteria) {
        Refrigerator refrigerator = new Refrigerator();
        if (criteria.getCriteria().get(SearchCriteria.Refrigerator.POWER_CONSUMPTION) != null) {
            refrigerator.setPowerConsumption(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Refrigerator.POWER_CONSUMPTION).toString()));
        }
        if (criteria.getCriteria().get(SearchCriteria.Refrigerator.WEIGHT) != null) {
            refrigerator.setWeight(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Refrigerator.WEIGHT).toString()));
        }
        if (criteria.getCriteria().get(SearchCriteria.Refrigerator.FREEZER_CAPACITY) != null) {
            refrigerator.setFreezerCapacity(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Refrigerator.FREEZER_CAPACITY).toString()));
        }
        if (criteria.getCriteria().get(SearchCriteria.Refrigerator.OVERALL_CAPACITY) != null) {
            refrigerator.setOverallCapacity(Double.parseDouble
                    (criteria.getCriteria().get(SearchCriteria.Refrigerator.OVERALL_CAPACITY).toString()));
        }
        if (criteria.getCriteria().get(SearchCriteria.Refrigerator.HEIGHT) != null) {
            refrigerator.setHeight(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Refrigerator.HEIGHT).toString()));
        }
        if (criteria.getCriteria().get(SearchCriteria.Refrigerator.WIDTH) != null) {
            refrigerator.setWidth(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Refrigerator.WIDTH).toString()));
        }
        return refrigerator;
    }
}
