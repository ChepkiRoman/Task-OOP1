package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;


public class RefrigeratorValidator extends ApplianceValidator {

    @Override
    <E> boolean validate(Criteria<E> criteria) {
        Map<E, Object> comparisonCriteria = criteria.getCriteria();
        Object powerConsumption = comparisonCriteria.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION);
        Object weight = comparisonCriteria.get(SearchCriteria.Refrigerator.WEIGHT);
        Object freezerCapacity = comparisonCriteria.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY);
        Object overallCapacity = comparisonCriteria.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY);
        Object height = comparisonCriteria.get(SearchCriteria.Refrigerator.HEIGHT);
        Object width = comparisonCriteria.get(SearchCriteria.Refrigerator.WIDTH);

        return (isNumberOrNull(powerConsumption) && isNumberOrNull(weight) && isNumberOrNull(freezerCapacity) && isNumberOrNull(overallCapacity) && isNumberOrNull(height) && isNumberOrNull(width));
    }
}
