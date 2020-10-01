package com.oop;

public class Room {
    private int roomNo;
    private String roomType;
    private int floor;
    private boolean occupied;
    private boolean needsCleaning;
    private float averagePrice;
    public Client occupant;

    public Room(){

    }

    public Room(int roomNo, String roomType, int floor, float averagePrice){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.floor = floor;
        this.averagePrice = averagePrice;
    }

    // Any other constructors?

    public Room(String roomType){
        this.roomType = roomType;
    }


    public int getRoomNo(){
        return roomNo;
    }

    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
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

    public float getAveragePrice(){
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice){
        if(averagePrice < 0){
            throw new IllegalArgumentException("Price cannot be negative.");
        }

        this.averagePrice = averagePrice;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    public boolean getNeedsCleaning(){
        return needsCleaning;
    }

    public void setNeedsCleaning(boolean needsCleaning){
        this.needsCleaning = needsCleaning;
    }

    /*
    public Client getClient(){
        return new Client();
    }

    public void setClient(Client client){
        this.client = client;
    }
    */

    public boolean reserve(int room){
        // Change room to isOccupied

        // What properties would be assigned to a client;
        //occupant = client;
        if(!(occupied && needsCleaning)){
            occupied = true;
            return true;
        }
        else{
            System.out.println("Room unavailable");
            return false;
        }


    }

    public void checkout(Client client){
        client = null;
        occupied = false;
        needsCleaning = true;
    }

    public String clean(){
        needsCleaning = false;
        return "Room has been cleaned";
    }


}
