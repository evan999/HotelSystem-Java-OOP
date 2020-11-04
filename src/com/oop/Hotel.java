package com.oop;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
   // private String roomType;
    private int rooms;
    private List<StandardRoom> availableStandards;
    private List<StandardRoom> reservedStandards;
    private List<SuiteRoom> availableSuites;
    private List<SuiteRoom> reservedSuites;
    private List<Client> clients;

    public Hotel(String name, int rooms, List<StandardRoom> availableStandards, List<StandardRoom> reservedStandards, List<SuiteRoom> availableSuites, List<SuiteRoom> reservedSuites, List<Client> clients){
        this.name = name;
        this.rooms = rooms;
        availableStandards = new ArrayList<>();
        availableSuites = new ArrayList<>();
        reservedSuites = new ArrayList<>();
        clients = new ArrayList<>();
    }


    public void addRoom(String roomType){
        // Add a room to room directory
        if(roomType == "standard" || roomType == "STANDARD"){
            availableStandards.add(new StandardRoom());
        }
        else if (roomType == "suite" || roomType == "SUITE"){
            availableSuites.add(new SuiteRoom());
        }

    }

    public void reserveRoom(String roomType){
        if(roomType == "standard"){
            reservedStandards.add(new StandardRoom());
        }
        else{
            reservedSuites.add(new SuiteRoom());
        }

        clients.add(new Client());
    }

    public void checkoutRoom(){

    }

    public float getClientBalance(){

    }

}
