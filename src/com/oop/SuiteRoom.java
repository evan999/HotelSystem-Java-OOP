package com.oop;

public class SuiteRoom extends Room {
    private int rooms;
    private int beds;
    public boolean kitchenette = true;
    public boolean needsRestock = false;

    public SuiteRoom(int rooms, int beds, boolean kitchenette, boolean needsRestock){
        super();
        this.rooms = rooms;
        this.beds = beds;
        this.kitchenette = kitchenette;
        this.needsRestock = needsRestock;
    }

    @Override
    public boolean reserve(int room, int currentBill){
        if(needsRestock){
            return false;
        }
        else{
            return super.reserve(room, currentBill);
        }
    }

    public void checkout(){
        needsRestock = true;
        super.checkout(occupant);
    }

    public boolean restock(){
        needsRestock = false;
        return needsRestock;
    }




}
