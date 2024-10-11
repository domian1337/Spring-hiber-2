package web.model;

public class Car {

    private String make;

    private String model;

    private int year;

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
