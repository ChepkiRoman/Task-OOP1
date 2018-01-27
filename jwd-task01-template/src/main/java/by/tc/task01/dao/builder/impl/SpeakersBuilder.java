package by.tc.task01.dao.builder.impl;

import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.List;


public class SpeakersBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(List<String> criteriaList) {
        Speakers speakers = new Speakers();
        speakers.setPowerConsumption(Double.parseDouble(criteriaList.get(0)));
        speakers.setNumberOfSpeakers(Double.parseDouble(criteriaList.get(1)));
        speakers.setFrequencyRange(criteriaList.get(2));
        speakers.setCordLength(Double.parseDouble(criteriaList.get(3)));
        return speakers;
    }
}
