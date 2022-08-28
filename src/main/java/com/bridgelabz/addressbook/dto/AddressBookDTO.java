package com.bridgelabz.addressbook.dto;

import lombok.Data;

public @Data class AddressBookDTO {
    public String firstName;
    public String lastName;
    public String gender;
    public String address;
    public String city;
    public String state;
    public int zipCode;
    public long phoneNumber;
    public String emailId;

}
