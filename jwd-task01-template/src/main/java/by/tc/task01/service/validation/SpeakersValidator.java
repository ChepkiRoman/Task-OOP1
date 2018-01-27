package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;


public class SpeakersValidator extends ApplianceValidator {

    @Override
    <E> boolean validate(Criteria<E> criteria) {
        Map<E, Object> comparisonCriteria = criteria.getCriteria();
        Object powerConsumption = comparisonCriteria.get(SearchCriteria.Speakers.POWER_CONSUMPTION);
        Object numberOfSpeakers = comparisonCriteria.get(SearchCriteria.Speakers.POWER_CONSUMPTION);
        Object frequencyRange = comparisonCriteria.get(SearchCriteria.Speakers.FREQUENCY_RANGE);
        Object cordLength = comparisonCriteria.get(SearchCriteria.Speakers.CORD_LENGTH);


        return (isNumberOrNull(powerConsumption) && isNumberOrNull(numberOfSpeakers) && isStringOrNull(frequencyRange) && isNumberOrNull(cordLength));
    }
}
