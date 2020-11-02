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

    public Hotel(List<StandardRoom> availableStandards, List<StandardRoom> reservedStandards, List<SuiteRoom> availableSuites, List<SuiteRoom> reservedSuites, List<Client> clients){
        availableStandards = new ArrayList<>();
        availableSuites = new ArrayList<>();
        reservedSuites = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addRoom(String roomType){
        if(roomType == "standard" || roomType == "STANDARD"){
            availableStandards.add(new StandardRoom());
        }
        else if (roomType == "suite" || roomType == "SUITE"){
            availableSuites.add(new SuiteRoom());
        }

    }

    public List<Integer> reserveRoom(String roomType){

    }

    public void checkoutRoom(){

    }

    public float getClientBalance(){

    }
}
