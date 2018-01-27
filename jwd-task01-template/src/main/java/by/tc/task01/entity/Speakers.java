package by.tc.task01.entity;

public class Speakers extends Appliance{
    private double powerConsumption;

    private double numberOfSpeakers;

    private String FrequencyRange;

    private double cordLength;

    public Speakers() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return FrequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        FrequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;

        Speakers speakers = (Speakers) o;

        if (Double.compare(speakers.getPowerConsumption(), getPowerConsumption()) != 0) return false;
        if (Double.compare(speakers.getNumberOfSpeakers(), getNumberOfSpeakers()) != 0) return false;
        if (Double.compare(speakers.getCordLength(), getCordLength()) != 0) return false;
        return getFrequencyRange() != null ? getFrequencyRange().equals(speakers.getFrequencyRange()) : speakers.getFrequencyRange() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getPowerConsumption());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getNumberOfSpeakers());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getFrequencyRange() != null ? getFrequencyRange().hashCode() : 0);
        temp = Double.doubleToLongBits(getCordLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", FrequencyRange='" + FrequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
