package com.zahid.mapping.controller;

import com.zahid.mapping.model.Address;
import com.zahid.mapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("")
    public Address create(@RequestBody Address address) {
        return addressService.create(address);
    }

    @GetMapping("/{id}")
    public Address read(@PathVariable Long id) {
        return addressService.read(id);
    }

    @PutMapping("/{id}")
    public Address update(@PathVariable Long id, @RequestBody Address address) {
        //address.setId(id);
        return addressService.update(address);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        addressService.delete(id);
    }

    @GetMapping("")
    public List<Address> findAll() {
        return addressService.findAll();
    }
}
