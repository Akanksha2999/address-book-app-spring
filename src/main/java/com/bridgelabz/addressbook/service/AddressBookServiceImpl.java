package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.AddressBookData;
import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class AddressBookServiceImpl implements AddressBookService{

    @Autowired
    private AddressBookRepository addressBookRepository;
    private List<AddressBookData> list = new ArrayList<>();
    public List<AddressBookData> getAddressBookData(){
        return addressBookRepository.findAll();
    }

    public AddressBookData getAddressBookDataById(int personId){
        return addressBookRepository.findById(personId)
                .orElseThrow(() -> new AddressBookException("User Not Found"));
    }

    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDTO);
        log.debug("User Data: " +addressBookData.toString());
        return addressBookRepository.save(addressBookData);
    }

    public AddressBookData updateAddressBookData(int personId ,AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }

    public void deleteAddressBookData(int personId){
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookRepository.delete(addressBookData);
    }
}
