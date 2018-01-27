package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;


public class VacuumCleanerValidator extends ApplianceValidator {
    @Override
    <E> boolean validate(Criteria<E> criteria) {
        Map<E, Object> comparisonCriteria = criteria.getCriteria();
        Object powerConsumption = comparisonCriteria.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION);
        Object filterType = comparisonCriteria.get(SearchCriteria.VacuumCleaner.FILTER_TYPE);
        Object bagType = comparisonCriteria.get(SearchCriteria.VacuumCleaner.BAG_TYPE);
        Object wandType = comparisonCriteria.get(SearchCriteria.VacuumCleaner.WAND_TYPE);
        Object motorSpeedRegulation = comparisonCriteria.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION);
        Object cleaningWidth = comparisonCriteria.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH);

        return (isNumberOrNull(powerConsumption) && isStringOrNull(filterType) && isStringOrNull(bagType) && isStringOrNull(wandType) && isNumberOrNull(motorSpeedRegulation) && isNumberOrNull(cleaningWidth));
    }
}
