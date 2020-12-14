package web.model;

public class Car {
    private String carModel;
    private int series;
    private int year;

    public Car(String carModel, int series, int year) {
        this.carModel = carModel;
        this.series = series;
        this.year = year;
    }

    public String getCarModel() {

        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
