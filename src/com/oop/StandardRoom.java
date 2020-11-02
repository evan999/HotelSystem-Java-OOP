package com.oop;

public class StandardRoom extends Room{
    private int rooms;
    private int beds;

    public StandardRoom(int roomNo, String roomType, float averagePrice, Client occupant, int rooms, int beds){
        super(roomNo, "Standard", averagePrice, occupant);
        this.rooms = rooms;
        this.beds = beds;
    }

    public int getBeds(){
        return beds;
    }

    public int getRooms(){
        return rooms;
    }

    @Override
    public boolean reserve(int roomNo, Client occupant){
        int partySize = occupant.getPartySize();
        if(partySize > beds*2){
            System.out.println("Party size is too large to accommodate for beds available.");
            return false;
        }
        else{
            return super.reserve(roomNo, getOccupant());
        }
    }
}
