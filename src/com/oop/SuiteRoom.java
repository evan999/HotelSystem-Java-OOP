package com.oop;

public class SuiteRoom extends Room {
    private int rooms;
    private int beds;
    public boolean kitchenette = true;
    public boolean needsRestock = false;

    public SuiteRoom(int rooms, int roomNo, int beds, Client occupant, float averagePrice){
        super(roomNo, "Suite", averagePrice, occupant);
        this.rooms = rooms;
        this.beds = beds;
    }

    @Override
    public boolean reserve(int room, Client occupant){
        if(needsRestock){
            return false;
        }
        else{
            return super.reserve(room, getOccupant());
        }
    }

    public float checkout(int nights){
        needsRestock = true;
        return super.checkout(nights);
    }

    public boolean restock(){
        needsRestock = false;
        return needsRestock;
    }




}
