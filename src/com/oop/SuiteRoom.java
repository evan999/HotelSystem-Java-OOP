package com.oop;

public class SuiteRoom extends Room {
    private int rooms;
    private int beds;
    private boolean kitchenette;
    private boolean needsRestock;

    public SuiteRoom(int rooms, int beds, boolean kitchenette, boolean needsRestock){
        super();
        this.rooms = rooms;
        this.beds = beds;
        this.kitchenette = kitchenette;
        this.needsRestock = needsRestock;
    }

    public int getRooms(){
        return rooms;
    }

    public void setRooms(int rooms){
        this.rooms = rooms;
    }

    public boolean reserve(int room){
        if(needsRestock){
            return false;
        }
        else{
            return super.reserve(room);
        }
    }


}
