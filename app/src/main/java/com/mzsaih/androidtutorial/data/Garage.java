package com.mzsaih.androidtutorial.data;

import java.util.ArrayList;

public class Garage {
    private int Id;
    private String Address;
    private Car[] cars;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getCars() {
        String resultat="";
        for(int i=0;i<cars.length;i++){
            if (cars[i] != null)
                resultat+="{marque= "+cars[i].getMarque()+" HorsePower= "+cars[i].getHorsePower()+" MaxSpeed= "+cars[i].getMaxSpeed()+"}";
        }
        return resultat;
    }

    public Garage(){
        cars = new Car[10];
    }

    public Garage(int id, String address) {
        cars = new Car[10];
        Id = id;
        Address = address;
    }


    public void addCars(int position,Car car) {
        cars[position] = car;
    }
    public int  getNumberOfCars(){
        int number = 0;
        for(int i=0;i<cars.length;i++){
            if (cars[i] != null)
                number++;
        }
        return number;
    }
}
