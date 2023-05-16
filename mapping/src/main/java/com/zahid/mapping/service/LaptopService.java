package com.zahid.mapping.service;

import com.zahid.mapping.model.Laptop;
import com.zahid.mapping.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;

    public Laptop create(Laptop laptop) {
        return laptopRepository.save(laptop);
    }


    public Laptop read(Long id) {
        return laptopRepository.findById(id).orElse(null);
    }


    public Laptop update(Laptop laptop) {
        return laptopRepository.save(laptop);
    }


    public void delete(Long id) {
        laptopRepository.deleteById(id);
    }


    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }
}
