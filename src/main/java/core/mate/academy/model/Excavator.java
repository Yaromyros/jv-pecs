package core.mate.academy.model;

public class Excavator extends Machine {
    private int enginePower;
    private String manufacturer;

    public Excavator() {
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
