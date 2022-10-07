package by.tc.task2.entity;

public class Appliance {

    private String COST;

    public String getCost() {
        return COST;
    }

    public void setCost(String cost) {
        this.COST = cost;
    }

    public Appliance(String cost) {
        this.COST = cost;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "COST='" + COST + '\'' +
                '}';
    }
}
