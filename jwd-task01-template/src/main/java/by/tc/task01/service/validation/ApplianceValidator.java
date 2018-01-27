package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;


public abstract class ApplianceValidator {
    abstract <E> boolean validate(final Criteria<E> criteria);


     static boolean isNumberOrNull(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof Number;
    }

     static boolean isStringOrNull(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String;
    }
}
