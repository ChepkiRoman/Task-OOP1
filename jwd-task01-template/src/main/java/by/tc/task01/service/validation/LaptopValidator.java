package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;


public class LaptopValidator extends ApplianceValidator {
    @Override
    <E>  boolean  validate(final Criteria<E> criteria) {

        Map<E, Object> comparisonCriteria = criteria.getCriteria();
        Object batteryCapacity = comparisonCriteria.get(SearchCriteria.Laptop.BATTERY_CAPACITY);
        Object os = comparisonCriteria.get(SearchCriteria.Laptop.OS);
        Object memoryROM = comparisonCriteria.get(SearchCriteria.Laptop.MEMORY_ROM);
        Object systemMemory = comparisonCriteria.get(SearchCriteria.Laptop.SYSTEM_MEMORY);
        Object cpu = comparisonCriteria.get(SearchCriteria.Laptop.CPU);
        Object displayInches = comparisonCriteria.get(SearchCriteria.Laptop.DISPLAY_INCHES);

        return (isNumberOrNull(batteryCapacity) && isNumberOrNull(memoryROM) && isNumberOrNull(systemMemory) && isNumberOrNull(cpu) && isNumberOrNull(displayInches)&& isStringOrNull(os));
    }
}
