package by.tc.task2.entity;

public class VacuumCleaner extends Appliance{
    private String POWER_CONSUMPTION;
    private String FILTER_TYPE;
    private String BAG_TYPE;
    private String WAND_TYPE;
    private String MOTOR_SPEED_REGULATION;
    private String CLEANING_WIDTH;

    public String getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(String POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public void setFILTER_TYPE(String FILTER_TYPE) {
        this.FILTER_TYPE = FILTER_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public void setBAG_TYPE(String BAG_TYPE) {
        this.BAG_TYPE = BAG_TYPE;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public void setWAND_TYPE(String WAND_TYPE) {
        this.WAND_TYPE = WAND_TYPE;
    }

    public String getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public void setMOTOR_SPEED_REGULATION(String MOTOR_SPEED_REGULATION) {
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
    }

    public String getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    public void setCLEANING_WIDTH(String CLEANING_WIDTH) {
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    public VacuumCleaner(String COST,String POWER_CONSUMPTION, String FILTER_TYPE, String BAG_TYPE, String WAND_TYPE, String MOTOR_SPEED_REGULATION, String CLEANING_WIDTH) {

        super(COST);

        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "POWER_CONSUMPTION='" + POWER_CONSUMPTION + '\'' +
                ", FILTER_TYPE='" + FILTER_TYPE + '\'' +
                ", BAG_TYPE='" + BAG_TYPE + '\'' +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                ", MOTOR_SPEED_REGULATION='" + MOTOR_SPEED_REGULATION + '\'' +
                ", CLEANING_WIDTH='" + CLEANING_WIDTH + '\'' +
                "} " + super.toString();
    }
}
