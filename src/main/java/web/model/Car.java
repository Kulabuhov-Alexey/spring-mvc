package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    private String model;
    private int hp;
    private String color;

    Car(){}

    public Car(String model, int hp, String color) {
        this.model = model;
        this.hp = hp;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Car> getListCar(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Vaz",80,"white"));
        cars.add(new Car("Vaz",90,"silver"));
        cars.add(new Car("Vaz",100,"brown"));
        cars.add(new Car("Vaz",106,"black"));
        cars.add(new Car("Vaz",73,"orange"));
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", color='" + color + '\'' +
                '}';
    }
}
