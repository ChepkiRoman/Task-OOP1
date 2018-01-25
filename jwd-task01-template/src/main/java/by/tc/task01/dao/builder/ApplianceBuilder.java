package by.tc.task01.dao.builder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

/**
 * Created by RomanChepki on 25.01.18.
 */
public interface ApplianceBuilder {
    <E>Appliance buildAppliance(Criteria<E> criteria);
}
