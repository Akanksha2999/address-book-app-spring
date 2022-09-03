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
    private List<AddressBookData> addressBookDataList = new ArrayList<>();
    public List<AddressBookData> getAddressBookData(){
        return addressBookDataList;
    }

    public AddressBookData getAddressBookDataById(int personId){
        return addressBookDataList.stream()
                .filter(addressBookData -> addressBookData.getPersonId() == personId)
                .findFirst()
                .orElseThrow(() -> new AddressBookException("User Not Found"));
    }

    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDTO);
        log.debug("User Data: " +addressBookData.toString());
        addressBookDataList.add(addressBookData);
        return addressBookRepository.save(addressBookData);
    }

    public AddressBookData updateAddressBookData(int personId ,AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = this.getAddressBookDataById(personId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setGender(addressBookDTO.gender);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setZipCode(addressBookDTO.zipCode);
        addressBookData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressBookData.setEmailId(addressBookDTO.emailId);
        addressBookDataList.set(personId-1, addressBookData);
        return addressBookData;
    }

    public void deleteAddressBookData(int personId){
        addressBookDataList.remove(personId-1);
    }
}
