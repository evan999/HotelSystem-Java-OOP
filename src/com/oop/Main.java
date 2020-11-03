package com.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client = new Client("Evan", 5, 200.00f, 75.00f, "555-555-5555");
        Room room = new Room(131, "Standard", 80.00f, client);
        //System.out.println(room.reserve(131, client));
        //System.out.println(room.checkout(3));
        System.out.println(room.getOccupant());
        //room.clean();
    }
}
