package by.tc.task01.dao.builder.impl;


import by.tc.task01.dao.builder.ApplianceBuilder;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

/**
 * Created by RomanChepki on 25.01.18.
 */
public class VacuumCleanerBuilder implements ApplianceBuilder {
    @Override
    public <E> Appliance buildAppliance(Criteria<E> criteria) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        if (criteria.getCriteria().get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION) != null) {
            vacuumCleaner.setPowerConsumption(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.FILTER_TYPE)!= null){
            vacuumCleaner.setFilterType(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.FILTER_TYPE).toString());
        }
        if(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.BAG_TYPE)!= null){
            vacuumCleaner.setBagType(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.BAG_TYPE).toString());
        }
        if(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.WAND_TYPE)!= null){
            vacuumCleaner.setWandType(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.WAND_TYPE).toString());
        }
        if(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION)!= null){
            vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION).toString()));
        }
        if(criteria.getCriteria().get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH)!= null){
            vacuumCleaner.setCleaningWidth(Integer.parseInt
                    (criteria.getCriteria().get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH).toString()));
        }


        return vacuumCleaner;
    }
}
