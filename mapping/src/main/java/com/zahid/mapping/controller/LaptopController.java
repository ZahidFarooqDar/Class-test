package com.zahid.mapping.controller;

import com.zahid.mapping.model.Laptop;
import com.zahid.mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping("")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopService.create(laptop);
    }

    @GetMapping("/{id}")
    public Laptop read(@PathVariable Long id) {
        return laptopService.read(id);
    }

    @PutMapping("/{id}")
    public Laptop update(@PathVariable Long id, @RequestBody Laptop laptop) {
        //laptop.setID(id);
        return laptopService.update(laptop);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        laptopService.delete(id);
    }

    @GetMapping("")
    public List<Laptop> findAll() {
        return laptopService.findAll();
    }
}
