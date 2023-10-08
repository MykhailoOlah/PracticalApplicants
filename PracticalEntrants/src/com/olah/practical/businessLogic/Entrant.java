package com.olah.practical.businessLogic;

public class Entrant {

    private final String family;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final int firstModule;
    private final int secondModule;

    public Entrant(String family, String firstName, String lastName, String address,
          int firstModule, int secondModule) {
        this.family = family;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.firstModule = firstModule;
        this.secondModule = secondModule;
    }

    @Override
    public String toString() {
        return family + " | "
              + firstName + " | "
              + lastName + " | "
              + address + " | "
              + firstModule + " | "
              + secondModule;
    }

    public String getFamily() {
        return family;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getFirstModule() {
        return firstModule;
    }

    public int getSecondModule() {
        return secondModule;
    }
}
