package by.tc.task01.entity;

public class TabletPC implements Appliance{
    private double batteryCapacity;

    private double displayInches;

    private double memoryRom;

    private double flashMemoryCapacity;

    private String color;

    public TabletPC() {
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (Double.compare(tabletPC.getBatteryCapacity(), getBatteryCapacity()) != 0) return false;
        if (Double.compare(tabletPC.getDisplayInches(), getDisplayInches()) != 0) return false;
        if (Double.compare(tabletPC.getMemoryRom(), getMemoryRom()) != 0) return false;
        if (Double.compare(tabletPC.getFlashMemoryCapacity(), getFlashMemoryCapacity()) != 0) return false;
        return getColor() != null ? getColor().equals(tabletPC.getColor()) : tabletPC.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getBatteryCapacity());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDisplayInches());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getMemoryRom());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFlashMemoryCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
