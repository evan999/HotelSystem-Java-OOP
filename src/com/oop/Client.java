package com.oop;

public class Client {
    private String name;
    private int partySize;
    private float currentBill;
    private float prepaidAmount;
    private String phoneNo;
    private int roomNo;
    private String roomType;

    public Client(){

    }

    public Client(String name, int partySize, float currentBill, float prepaidAmount, String phoneNo){
        this.name = name;
        this.partySize = partySize;
        this.currentBill = currentBill;
        this.prepaidAmount = prepaidAmount;
        this.phoneNo = phoneNo;
    }

    public float makePayment(float payment){
        prepaidAmount += payment;
        return prepaidAmount;
    }

    public float chargeRoom(float charge){
        currentBill += charge;
        return currentBill;
    }

    public String getName(){
        return name;
    }

    public int getPartySize(){
        return partySize;
    }

    public float getOutstandingBalance(){
        return currentBill;
    }
}
