package com.fullstack.controller;

import com.fullstack.entity.Customer;
import com.fullstack.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final ICustomerService customerService;

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Customer> saveData(@RequestBody Customer customer){
        log.info("@@@@@@@@@@ Trying to Save Data for Customer : " + customer.getCustName());
         return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
    }

    @GetMapping(value = "/findall", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<List<Customer>> findAll(){
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
}
