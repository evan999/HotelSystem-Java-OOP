package com.oop;

public class Room {
    private int roomNo;
    private String roomType;
    private int floor;
    private boolean occupied = false;
    private boolean needsCleaning = false;
    private int averagePrice = 38000;
    public Client occupant = new Client();

    public Room(){

    }

    public Room(int roomNo, String roomType, int floor, int averagePrice, Client occupant){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.floor = floor;
        this.averagePrice = averagePrice;
        this.occupant = occupant;
    }

    // Any other constructors?

    public Room(String roomType){
        this.roomType = roomType;
    }

    public int getFloor(){
        return floor;
    }

    public void setFloor(int floor){
        if(floor > 0){
            throw new IllegalArgumentException("Floor cannot be negative.");
        }
        this.floor = floor;
    }

    public int getAveragePrice(){
        return averagePrice;
    }

    public void setAveragePrice(int averagePrice){
        if(averagePrice < 0){
            throw new IllegalArgumentException("Price cannot be negative.");
        }

        this.averagePrice = averagePrice;
    }


    public boolean reserve(int room, int currentBill){
        // Change room to isOccupied

        // What properties would be assigned to a client;
        Client client = new Client();
        occupant = client;
        if(!(occupied && needsCleaning)){
            occupied = true;
            client.currentBill = averagePrice;
            return true;
        }
        else{
            System.out.println("Room unavailable");
            return false;
        }


    }

    public void checkout(Client occupant){
        // remove client from room
        System.out.println(occupant.getOutstandingBalance());
        occupant = null;
        occupied = false;
        needsCleaning = true;

    }

    public void clean(){
        needsCleaning = false;
        System.out.println("Room has been cleaned");
    }


}
