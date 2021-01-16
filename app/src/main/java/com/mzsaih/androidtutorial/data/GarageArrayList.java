package com.mzsaih.androidtutorial.data;

import java.util.ArrayList;

public class GarageArrayList {
    private int Id;
    private String Address;
    private ArrayList<Car> cars;

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
        for(int i=0;i<cars.size();i++){
                resultat+="{marque= "+cars.get(i).getMarque()+" HorsePower= "+cars.get(i).getHorsePower()+" MaxSpeed= "+cars.get(i).getMaxSpeed()+"}";
        }
        return resultat;
    }

    public GarageArrayList(){
        cars = new ArrayList<>();
    }

    public GarageArrayList(int id, String address) {
        cars = new ArrayList<>();
        Id = id;
        Address = address;
    }


    public void addCars(Car car) {
        cars.add(car);
    }
    public void removeCar(Car car) {
        cars.remove(car);
    }
    public int  getNumberOfCars(){
        return cars.size();
    }
}
