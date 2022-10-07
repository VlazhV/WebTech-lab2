package by.tc.task2.entity;

public class Laptop extends Appliance{

    private String BATTERY_CAPACITY;
    private String OS;
    private String MEMORY_ROM;
    private String SYSTEM_MEMORY;
    private String CPU;
    private String DISPLAY_INCHS;

    public Laptop(String COST,String BATTERY_CAPACITY, String OS, String MEMORY_ROM, String SYSTEM_MEMORY, String CPU, String DISPLAY_INCHS) {

        super(COST);

        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }



    public String getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(String BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(String MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public String getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public void setSYSTEM_MEMORY(String SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    public void setDISPLAY_INCHS(String DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY='" + BATTERY_CAPACITY + '\'' +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM='" + MEMORY_ROM + '\'' +
                ", SYSTEM_MEMORY='" + SYSTEM_MEMORY + '\'' +
                ", CPU='" + CPU + '\'' +
                ", DISPLAY_INCHS='" + DISPLAY_INCHS + '\'' +
                "} " + super.toString();
    }
}
