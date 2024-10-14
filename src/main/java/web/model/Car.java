package web.model;

import org.springframework.stereotype.Controller;

import java.util.*;


public class Car {

    private String make;
    private String model;
    private int year;


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "make: " + make + ", model: " + model + ", year: " + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Car && obj.getClass() == this.getClass()) {
            Car car = (Car) obj;
            return car.getMake().equals(this.getMake()) && car.getModel().equals(this.getModel()) && car.getYear() == this.getYear();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + make.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        return result;
    }
}
