package by.tc.task01.entity;

public class Laptop implements Appliance{
    private double batteryCapacity;

    private String os;

    private double memoryRom;

    private double systemMemory;

    private double cpu;

    private double displayInches;

    public Laptop() {
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) != 0) return false;
        if (getMemoryRom() != laptop.getMemoryRom()) return false;
        if (getSystemMemory() != laptop.getSystemMemory()) return false;
        if (Double.compare(laptop.getCpu(), getCpu()) != 0) return false;
        if (Double.compare(laptop.getDisplayInches(), getDisplayInches()) != 0) return false;
        return getOs() != null ? getOs().equals(laptop.getOs()) : laptop.getOs() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getBatteryCapacity());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getOs() != null ? getOs().hashCode() : 0);
        temp = Double.doubleToLongBits(getMemoryRom());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSystemMemory());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCpu());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDisplayInches());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
