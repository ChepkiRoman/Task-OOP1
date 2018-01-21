package by.tc.task01.entity;

public class Speakers extends Appliance{
    private int powerConsumption;

    private int numberOfSpeakers;

    private String FrequencyRange;

    private double cordLength;

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
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

        if (getPowerConsumption() != speakers.getPowerConsumption()) return false;
        if (getNumberOfSpeakers() != speakers.getNumberOfSpeakers()) return false;
        if (Double.compare(speakers.getCordLength(), getCordLength()) != 0) return false;
        return getFrequencyRange() != null ? getFrequencyRange().equals(speakers.getFrequencyRange()) : speakers.getFrequencyRange() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getPowerConsumption();
        result = 31 * result + getNumberOfSpeakers();
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
