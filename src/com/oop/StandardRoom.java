package com.oop;

public class StandardRoom extends Room{
    private int rooms;
    private int beds;


    public StandardRoom(){

    }


    public StandardRoom(String roomType, int rooms, int beds){
        super();
        this.rooms = rooms;
        this.beds = beds;
    }

    public int getBeds(){
        return beds;
    }

    public void setBeds(int beds){
        if(beds > 4 || beds < 1){
            throw new IllegalArgumentException("Beds must be 1 or 2.");
        }

        this.beds = beds;
    }

    public int getRooms(){
        return rooms;
    }

    public void setRooms(int rooms){
        this.rooms = rooms;
    }

    public boolean reserve(int room, int partySize){
        if(partySize > beds*2){
            return false;
        }
        else{
            return super.reserve(room);
        }
    }


    /*
    @Override
    public boolean reserve(Client client, ){

    }
    */

}
