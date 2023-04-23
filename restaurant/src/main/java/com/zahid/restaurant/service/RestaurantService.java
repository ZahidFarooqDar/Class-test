package com.zahid.restaurant.service;
import com.zahid.restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {
    private static List<Restaurant> restos = new ArrayList<>();
    static {
        restos.add(new Restaurant("Shangrila","Srinagar",1,"Biryani",500));
        restos.add(new Restaurant("Darjeeling","Anantnag",2,"Chicken Fry",200));
        restos.add(new Restaurant("Hawaii","Kulgam",3,"Fish",200));
        restos.add(new Restaurant("Hotel Taj","Baramulla",4,"Wazwan",200));
        restos.add(new Restaurant("Nigeen","Srinagar",5,"Masala Dosa",170));
    }

    public void addRestaurant(Restaurant resto){
        restos.add(resto);
    }

    public List<Restaurant> findAllRestaurant()
    {
        return restos;
    }

    public Restaurant findByName( String name){
        Predicate<? super Restaurant> predicate = rest -> rest.getResto_name().equals(name);
        Restaurant rest=restos.stream().filter(predicate).findFirst().get();
        return rest;
    }

    public Restaurant findByNumber( int number){
        Predicate<? super Restaurant> predicate = rest -> rest.getResto_number()==number;
        Restaurant rest=restos.stream().filter(predicate).findFirst().get();
        return rest;
    }

    public void deleteRestaurant(int number){
        Predicate<? super Restaurant> predicate=rest ->rest.getResto_number()==number;
        restos.removeIf(predicate);
    }


    public void updateRestaurant(int number, Restaurant newrest){
        Restaurant rest=findByNumber(number);
        rest.setResto_name(newrest.getResto_name());
        rest.setResto_address(newrest.getResto_address());
        rest.setResto_number(newrest.getResto_number());
        rest.setResto_speciality(newrest.getResto_speciality());
        rest.setResto_totalstaff(newrest.getResto_totalstaff());
    }
}