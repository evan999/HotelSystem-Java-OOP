package com.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotel {
    private String name;
   // private String roomType;
    private int rooms;
    private List<StandardRoom> availableStandards;
    private List<StandardRoom> reservedStandards;
    private List<SuiteRoom> availableSuites;
    private List<SuiteRoom> reservedSuites;
    private HashMap<String, Client> clients;
    private Integer clientId = 0;

    public Hotel(String name, int rooms, List<StandardRoom> availableStandards, List<StandardRoom> reservedStandards, List<SuiteRoom> availableSuites, List<SuiteRoom> reservedSuites, List<Client> clients){
        this.name = name;
        this.rooms = rooms;
        availableStandards = new ArrayList<>();
        availableSuites = new ArrayList<>();
        reservedSuites = new ArrayList<>();
        clients = new ArrayList<>();
    }


    public void addRoom(int roomNo, String roomType, float averagePrice, Client occupant, int rooms, int beds){
        // Add a room to room directory
        switch(roomType){
            case "standard":
                availableStandards.add(new StandardRoom(roomNo, "standard", averagePrice, occupant, rooms, beds));
            case "suite":
                availableSuites.add(new SuiteRoom(roomNo, "suite", averagePrice, occupant, rooms, beds));
            default:
                System.out.println("Invalid room type");

        }
    }

    public void reserveRoom(int roomNo, String roomType, float averagePrice, Client occupant, int rooms, int beds){
        switch(roomType){
            case "standard":
                reservedStandards.add(new StandardRoom(roomNo, "standard", averagePrice, occupant, rooms, beds));
            case "suite":
                reservedSuites.add(new SuiteRoom(roomNo, "suite", averagePrice, occupant, rooms, beds));
            default:
                System.out.println("Room unavailable.");
        }

        checkoutRoom();
    }

    public void addClient(String name, int partySize, float currentBill, float prepaidAmount, String phoneNo){
        clientId += 1;
        clients.put(clientId.toString(), new Client(name, partySize, currentBill, prepaidAmount, phoneNo));
    }

    public void checkoutRoom(){
        
    }

    public float getClientBalance(Client occupant){
        String name = occupant.getName();

    }

}
