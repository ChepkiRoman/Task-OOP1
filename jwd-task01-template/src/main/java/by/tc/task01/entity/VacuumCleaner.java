package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    private double powerConsumption;

    private String filterType;

    private String bagType;

    private String wandType;

    private double motorSpeedRegulation;

    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (Double.compare(that.getPowerConsumption(), getPowerConsumption()) != 0) return false;
        if (Double.compare(that.getMotorSpeedRegulation(), getMotorSpeedRegulation()) != 0) return false;
        if (Double.compare(that.getCleaningWidth(), getCleaningWidth()) != 0) return false;
        if (getFilterType() != null ? !getFilterType().equals(that.getFilterType()) : that.getFilterType() != null)
            return false;
        if (getBagType() != null ? !getBagType().equals(that.getBagType()) : that.getBagType() != null) return false;
        return getWandType() != null ? getWandType().equals(that.getWandType()) : that.getWandType() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPowerConsumption());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getFilterType() != null ? getFilterType().hashCode() : 0);
        result = 31 * result + (getBagType() != null ? getBagType().hashCode() : 0);
        result = 31 * result + (getWandType() != null ? getWandType().hashCode() : 0);
        temp = Double.doubleToLongBits(getMotorSpeedRegulation());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCleaningWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleanerBuilder{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
