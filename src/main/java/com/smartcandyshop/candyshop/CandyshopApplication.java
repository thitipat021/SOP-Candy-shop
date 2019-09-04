package com.smartcandyshop.candyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class CandyshopApplication {
    CandyMenu listCandy = new CandyMenu();
    public static void main(String[] args) {
        SpringApplication.run(CandyshopApplication.class, args);
    }

    @RequestMapping("/")
    String Home(){
        return "<font color=\"blue\">Welcome to Candy Shop ^_^</font><br>localhost:port/candies --> go see all our sweets<br>localhost:port/candy/{id} --> eg* /candy/1 --> see candy id = 1<br>localhost:port/candy/{id}/order --> eg* /candy/1/order --> add candy id = 1 in the bag<br>localhost:port/bag --> see candy in the bag";
    }

    @RequestMapping("/candies")
    Candies[] allCandies(){
        return listCandy.getAllCandy();
    }

    @RequestMapping(value = "/candy/{id}", method = RequestMethod.GET)
    public Candies candy(@PathVariable int id){
        return listCandy.getCandy(id);
    }

    List<Candies> bag = new ArrayList<Candies>();
    @RequestMapping(value = "/bag", method = RequestMethod.GET)
    List<Candies> bag(){
        return bag;
    }

    @RequestMapping(value = "/candy/{id}/order", method = RequestMethod.GET)
    String order(@PathVariable int id){
        bag.add(listCandy.getCandy(id));
        return String.format("Candy ID: %s<br>%s added to your bag", id,listCandy.getCandy(id).getCandyBrand());
    }
}
