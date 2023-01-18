package transport;

import java.util.Objects;

import static transport.ValidateParameters.*;

public class Transport {

    public String brand;
    public String model;
    public String year;
    public String country;
    public String color;
    public Integer maxSpeed;

    public Transport(String brand, String model, String year, String country, String color, int maxSpeed) {
        this.brand = validateTransportParameters(brand);
        this.model = validateTransportParameters(model);
        this.year = validateYear(year);
        this.country = validateTransportParameters(country);
        this.color = validateTransportColor(color);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public String validateYear(String value) {
        return validateString(value, "default");
    }
    public String validateTransportColor(String value) {
        return validateString(value, "default");
    }

    public static int validateMaxSpeed(int value) {
        return value <= 0 ? 150 : value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return brand.equals(transport.brand) && model.equals(transport.model) &&
                year.equals(transport.year) && country.equals(transport.country) &&
                color.equals(transport.color) && maxSpeed.equals(transport.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed);
    }
}
