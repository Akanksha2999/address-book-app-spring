package com.bridgelabz.addressbook.entity;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.Data;

public @Data class AddressBookData {
    private int personId;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emailId;


    public AddressBookData(int personId, AddressBookDTO addressBookDTO){
        this.personId = personId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.gender = addressBookDTO.gender;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zipCode = addressBookDTO.zipCode;
        this.phoneNumber = addressBookDTO.phoneNumber;
        this.emailId = addressBookDTO.emailId;
    }
}
