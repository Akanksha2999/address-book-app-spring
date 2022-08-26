package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService{
    public List<AddressBookData> getAddressBookData(){
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1,new AddressBookDTO("Akanksha", "Jadhav", "female", "Mumbai", "Mumbai", "Maharashtra", 98235, 1029384752, "akanksha@gmail.com")));
        return addressBookDataList;
    }

    public AddressBookData getAddressBookDataById(int personId){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1,new AddressBookDTO("Akanksha", "Jadhav", "female", "Mumbai", "Mumbai", "Maharashtra", 98235, 1029384752, "akanksha@gmail.com"));
        return addressBookData;
    }

    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    public void deleteAddressBookData(int personId){

    }
}
