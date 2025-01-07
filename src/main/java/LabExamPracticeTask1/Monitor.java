package LabExamPracticeTask1;

public class Monitor {

    private String manufacturer;
    private int screenSize;
    private Double price;
    private int yearOfManufacturing;
    private int refreshRate;

    public Monitor(String manufacturer, int screenSize, Double price, int yearOfManufacturing, int refreshRate) {
        if(price < 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.refreshRate = refreshRate;
    }

    public int getYearOfManufacturing() {
        return this.yearOfManufacturing;
    }

    public Double getPrice() {
        return price;
    }

    public Double calculateDiscountedPrice() {
        if((2024 - this.yearOfManufacturing) > 3) {
            return this.price*0.8;
        } else {
            return this.price;
        }
    }

    public Boolean isPremium() {
        return this.manufacturer.equals("Dell") && this.screenSize >= 27 && this.refreshRate >= 120;
    }

    public Boolean is4K() {
        return this.screenSize >= 32 && this.refreshRate >= 60;
    }
}
