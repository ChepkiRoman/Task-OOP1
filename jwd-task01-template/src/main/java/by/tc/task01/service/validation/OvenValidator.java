package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;


public class OvenValidator extends ApplianceValidator {

    @Override
    <E> boolean validate(Criteria<E> criteria) {
        Map<E, Object> comparisonCriteria = criteria.getCriteria();
        Object powerConsumption = comparisonCriteria.get(SearchCriteria.Oven.POWER_CONSUMPTION);
        Object weight = comparisonCriteria.get(SearchCriteria.Oven.WEIGHT);
        Object capacity = comparisonCriteria.get(SearchCriteria.Oven.CAPACITY);
        Object depth = comparisonCriteria.get(SearchCriteria.Oven.DEPTH);
        Object height = comparisonCriteria.get(SearchCriteria.Oven.HEIGHT);
        Object width = comparisonCriteria.get(SearchCriteria.Oven.WIDTH);

        return (isNumberOrNull(powerConsumption) && isNumberOrNull(weight) && isNumberOrNull(capacity) && isNumberOrNull(depth) && isNumberOrNull(height)&& isStringOrNull(width));
    }
}
