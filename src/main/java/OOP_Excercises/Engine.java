package OOP_Excercises;

import lombok.ToString;

@ToString

public class Engine {
    double capacity;
    int horsePower;
    double fuelConsumption;

    public Engine(double capacity, int horsePower, double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
