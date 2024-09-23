package com.wipro.sets;

import java.util.Objects;

public class Car {

    private int carId; // Data hiding or security
    private String carName;
    private double price;

    public Car() {
        super();
    }

    public Car(int carId, String carName, double price) {
        super();
        this.carId = carId;
        this.carName = carName;
        this.price = price;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return carId == other.carId;
    }

    @Override
    public String toString() {
        return "Car [carId=" + carId + ", carName=" + carName + ", price=" + price + "] \n";
    }
}

