package web.model;

public class Car {
    private String model;
    private int year;
    private String price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Car(String model, int year, String price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
}
