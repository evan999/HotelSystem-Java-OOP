package com.oop;

public class Room {
    private int roomNo;
    private String roomType;
    private int floor;
    private boolean occupied;
    private boolean needsCleaning;
    //private float costPerNight;
    private float averagePrice = 38000;
    private Client occupant;


    public Room(int roomNo, String roomType, float averagePrice, Client occupant){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.floor = floor;
        this.occupant = occupant;
        this.averagePrice = averagePrice;
        occupied = false;
        needsCleaning = false;
    }

    // Any other constructors?

    public Room(String roomType){
        this.roomType = roomType;
    }

    public boolean reserve(int roomNo, Client occupant){

        occupant = occupant;
        if(!(occupied && needsCleaning)){
            occupied = true;
            return true;
        }
        else{
            System.out.println("Room unavailable");
            return false;
        }


    }

    public float checkout(int nights){
        occupant = null;
        occupied = false;
        needsCleaning = true;
        float totalCost = averagePrice * nights;
        System.out.println("Total cost of room: " + totalCost);
        return totalCost;
    }

    public void clean(){
        needsCleaning = false;
        System.out.println("Room has been cleaned");
    }

    public Client getOccupant(){
        return occupant;
    }

    @Override
    public String toString(){
        return occupant.getName();
    }


}
