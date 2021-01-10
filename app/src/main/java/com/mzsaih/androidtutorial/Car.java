package com.mzsaih.androidtutorial;

public class Car {
    private String marque;
    private int HorsePower;
    private int MaxSpeed;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
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

    public Car(){

    }

    public Car(String marque, int horsepower, int maxspeed){
        this.marque = marque;
        this.MaxSpeed = maxspeed;
        this.HorsePower = horsepower;
    }
}
