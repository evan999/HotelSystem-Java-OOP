package com.oop;

public class Client {
    private String name;
    private int partySize;
    private int currentBill;
    private int prepaidAmount;
    private String phoneNo;
    private int roomNo;
    private String roomType;

    public Client(){

    }

    public Client(String name, int partySize, int currentBill, int prepaidAmount, String phoneNo){
        this.name = name;
        this.partySize = partySize;
        this.currentBill = currentBill;
        this.prepaidAmount = prepaidAmount;
        setPhoneNo(phoneNo);
    }

    public int makePayment(int payment){
        prepaidAmount += payment;
        return prepaidAmount;
    }

    public int chargeRoom(int charge){
        currentBill += charge;
        return currentBill;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPartySize(){
        return partySize;
    }

    public void setPartySize(int partySize){
        if(partySize > 4){
            throw new IllegalArgumentException("Party size is too large!");
        }
        else if(partySize < 1){
            throw new IllegalArgumentException("Party size cannot be 0 or negative!");
        }

        this.partySize = partySize;
    }

    public float getOutstandingBalance(int currentBill){
        int prepaid = getPrepaidAmount();
        return currentBill - prepaid;
    }

    public int getPrepaidAmount(){
        return prepaidAmount;
    }

    public void setPrepaidAmount(int prepaidAmount){
        this.prepaidAmount = prepaidAmount;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo){
        if(phoneNo.matches("[02-9]\\d{0,9}")){
            this.phoneNo = phoneNo;
        }
        else{
            throw new IllegalArgumentException("Phone number is invalid.");
        }
    }

    public int getRoomNo(){
        return roomNo;
    }

    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        if(!(roomType == "double" || roomType == "single")){
            throw new IllegalArgumentException("Invalid room type");
        }

        this.roomType = roomType;
    }
}
