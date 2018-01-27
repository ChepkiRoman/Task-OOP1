package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        if (criteria.getCriteria().size() == 0) {
            return false;
        }
        String type = criteria.getApplianceType();
        if (type.equals("Laptop")) {
            return new LaptopValidator().validate(criteria);
        }
        if (type.equals("Oven")) {
            return new OvenValidator().validate(criteria);
        }
        if (type.equals("Refrigerator")) {
            return new RefrigeratorValidator().validate(criteria);
        }
        if (type.equals("Speakers")) {
            return new SpeakersValidator().validate(criteria);
        }
        if (type.equals("TabletPC")) {
            return new TabletPCValidator().validate(criteria);
        }
        if (type.equals("VacuumCleaner")) {
            return new VacuumCleanerValidator().validate(criteria);
        }

        return false;
    }
}

