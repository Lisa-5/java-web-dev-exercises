package exercises.technology;

import java.util.Objects;

public class Computer extends AbstractEntity {

    private int id;
    private String make;
    private String model;
    private String operatingSystem;
    private int yearManufactured;

    public Computer(int id, String make, String model, String operatingSystem, int yearManufactured){
        this.id = id;
        this.make = make;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.yearManufactured = yearManufactured;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return id == computer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", yearManufactured=" + yearManufactured +
                '}';
    }
}
