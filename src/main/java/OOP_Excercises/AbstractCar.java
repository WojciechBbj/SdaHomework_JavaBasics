package OOP_Excercises;

public abstract class AbstractCar {
    String producer;
    String model;
    String color;
    int seatsNumber;
    Engine engine;

    public AbstractCar() {

        this.seatsNumber = 2;
    }

    public AbstractCar(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "AbstractCar{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine +
                '}';
    }
}
