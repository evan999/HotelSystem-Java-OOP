package com.oop;

public class SuiteRoom extends Room {
    private int rooms;
    private int beds;
    private boolean kitchenette = true;
    private boolean needsRestock = false;

    public SuiteRoom(int roomNo, String roomType, float averagePrice, Client occupant, int rooms, int beds){
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
