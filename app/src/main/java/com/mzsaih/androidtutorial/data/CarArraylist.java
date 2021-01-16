package com.mzsaih.androidtutorial.data;

public class CarArraylist {
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
    public CarArraylist(){}
    public CarArraylist(String marque, int horsepower, int maxspeed){
        this.marque = marque;
        this.MaxSpeed = maxspeed;
        this.HorsePower = horsepower;
    }
    public CarArraylist(String marque, int horsepower){
        this.marque = marque;
        this.HorsePower = horsepower;
    }

    public CarArraylist(CarArraylist car){
        this.marque = car.marque;
        this.MaxSpeed = car.MaxSpeed;
        this.HorsePower = car.HorsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marque='" + marque + '\'' +
                ", HorsePower=" + HorsePower +
                ", MaxSpeed=" + MaxSpeed +
                '}';
    }
}
