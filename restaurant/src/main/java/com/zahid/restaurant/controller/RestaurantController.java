package com.zahid.restaurant.controller;


import com.zahid.restaurant.model.Restaurant;
import com.zahid.restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    private final RestaurantService restoService;
    public RestaurantController(RestaurantService restoService){
        this.restoService=restoService;
    }
    @PostMapping("/add-restaurant")
    public void addResto(@RequestBody Restaurant restaurant){
        restoService.addRestaurant(restaurant);
    }
    @GetMapping("/find-restaurant/name/{name}")
    public Restaurant findRestaurantByName(@PathVariable String name){
        return restoService.findByName(name);
    }
    @GetMapping("/find-all-restaurant")
    public List<Restaurant> findAllRestos(){
        return restoService.findAllRestaurant();
    }

    @PutMapping("/update-restaurant/number/{number}")
    public void updateRestaurant(@PathVariable int number,@RequestBody Restaurant restaurant){
        restoService.updateRestaurant(number,restaurant);
    }
    @DeleteMapping("/delete-restaurant/number/{number}")
    public void deleteRestaurant(@PathVariable int number){
        restoService.deleteRestaurant(number);
    }
}