package com.zahid.mapping.service;
import com.zahid.mapping.model.Address;

import com.zahid.mapping.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public Address create(Address address) {
        return addressRepository.save(address);
    }

    public Address read(Long id) {
        return addressRepository.findById(id).orElse(null);
    }
    public Address update(Address address) {
        return addressRepository.save(address);
    }

    public void delete(Long id) {
        addressRepository.deleteById(id);
    }
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}
