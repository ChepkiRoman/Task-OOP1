package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;

    private String filterType;

    private String bagType;

    private String wandType;

    private int motorSpeedRegulation;

    private int cleaningWidth;

    public VacuumCleaner() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
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

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (getPowerConsumption() != that.getPowerConsumption()) return false;
        if (getMotorSpeedRegulation() != that.getMotorSpeedRegulation()) return false;
        if (getCleaningWidth() != that.getCleaningWidth()) return false;
        if (getFilterType() != null ? !getFilterType().equals(that.getFilterType()) : that.getFilterType() != null)
            return false;
        if (getBagType() != null ? !getBagType().equals(that.getBagType()) : that.getBagType() != null) return false;
        return getWandType() != null ? getWandType().equals(that.getWandType()) : that.getWandType() == null;
    }

    @Override
    public int hashCode() {
        int result = getPowerConsumption();
        result = 31 * result + (getFilterType() != null ? getFilterType().hashCode() : 0);
        result = 31 * result + (getBagType() != null ? getBagType().hashCode() : 0);
        result = 31 * result + (getWandType() != null ? getWandType().hashCode() : 0);
        result = 31 * result + getMotorSpeedRegulation();
        result = 31 * result + getCleaningWidth();
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
