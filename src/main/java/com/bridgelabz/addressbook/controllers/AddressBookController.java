package com.bridgelabz.addressbook.controllers;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<String> getAddressBookData(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }
    @GetMapping("/get/{personId}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("personId")int personId){
        return new ResponseEntity<String>("Get Call Success for id: " +personId,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Created Address Book Data for: " +addressBookDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        return new ResponseEntity<String>("Updated Address Book Data for: " +addressBookDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("personId")int personId){
        return new ResponseEntity<String>("Delete Call Success for id: " +personId, HttpStatus.OK);
    }
}
