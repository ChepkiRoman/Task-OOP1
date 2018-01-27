package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;


public class TabletPCValidator extends ApplianceValidator {
    @Override
    <E> boolean validate(Criteria<E> criteria) {
        Map<E, Object> comparisonCriteria = criteria.getCriteria();
        Object batteryCapacity = comparisonCriteria.get(SearchCriteria.TabletPC.BATTERY_CAPACITY);
        Object displayInches = comparisonCriteria.get(SearchCriteria.TabletPC.DISPLAY_INCHES);
        Object memoryROM = comparisonCriteria.get(SearchCriteria.TabletPC.MEMORY_ROM);
        Object flashMemoryCapacity = comparisonCriteria.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY);
        Object color = comparisonCriteria.get(SearchCriteria.TabletPC.COLOR);

        return (isNumberOrNull(batteryCapacity) && isNumberOrNull(displayInches) && isNumberOrNull(memoryROM) && isNumberOrNull(flashMemoryCapacity) && isStringOrNull(color));

    }
}
