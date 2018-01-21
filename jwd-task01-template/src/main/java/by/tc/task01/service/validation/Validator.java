package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        Set<Object> criteriaContent = new HashSet<>(criteria.getCriteriaContent());

        if (criteriaContent.isEmpty()) {
            System.out.println("There is no criteria");
            return false;
        }

        for (Object value : criteriaContent) {
            if (value instanceof Number) {
                Number number = (Number) value;
                double resultNumb = number.doubleValue();
                if (resultNumb <= 0) {
                    System.out.println("Value in criteria less then zero");
                    return false;
                } else if (value instanceof String) {
                    String string = (String) value;
                    if (string.isEmpty()) {
                        System.out.println("String value in criteria is empty");
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

