package com.bridgelabz.addressbook.dto;

public class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String gender;
    public String address;
    public String city;
    public String state;
    public Integer zipCode;
    public Long phoneNumber;
    public String emailId;

    public AddressBookDTO(String firstName, String lastName, String gender, String address, String city, String state, Integer zipCode, Long phoneNumber, String emailId) {

    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
