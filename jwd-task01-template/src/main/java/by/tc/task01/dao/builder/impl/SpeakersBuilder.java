package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by RomanChepki on 25.01.18.
 */
public class SpeakersBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(Criteria<E> criteria) {
        Speakers speakers = new Speakers();
        if(criteria.getCriteria().get(SearchCriteria.Speakers.POWER_CONSUMPTION)!= null){
            speakers.setPowerConsumption(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Speakers.POWER_CONSUMPTION).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS)!= null){
            speakers.setNumberOfSpeakers(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.Speakers.FREQUENCY_RANGE)!= null){
            speakers.setFrequencyRange(criteria.getCriteria().get(SearchCriteria.Speakers.FREQUENCY_RANGE).toString());
        }
        if(criteria.getCriteria().get(SearchCriteria.Speakers.CORD_LENGTH)!= null){
            speakers.setCordLength(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.Speakers.CORD_LENGTH).toString()));
        }
        return speakers;
    }
}
