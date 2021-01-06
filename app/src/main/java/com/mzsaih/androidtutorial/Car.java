package com.mzsaih.androidtutorial;

public class Car {
    private String Marque;
    private int HorsePower;
    private int MaxSpeed;

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public Car(String marque, int horsepower, int maxspeed){
        this.Marque = marque;
        this.MaxSpeed = maxspeed;
        this.HorsePower = horsepower;
    }
}
