package com.java.Flipkart.controller;

import com.java.Flipkart.Service.FlipkartService;
import com.java.Flipkart.model.Flipkart;
import com.java.Flipkart.repository.FlipkartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/flipkart")
@RestController
public class FlipkartController {

    @Autowired
    private FlipkartService flipkartservice;
    @Autowired
    private FlipkartRepository flipkartRepository;

    //For GetMapping
    @GetMapping("/getallproduct")
    public List<Flipkart> getAllFlipkart() {
        return flipkartservice.getAllFlipkart();
    }

    //For GetMapping with one particular id
    @GetMapping("/getproductbyid/{id}")
    public Optional<Flipkart> getproductwithparticularid(@PathVariable("id") String id) {
        return flipkartservice.getwithparticularid(id);
    }

    //For PostMapping
    @PostMapping("/createflipkart")
    public Flipkart createflipkart(@RequestBody Flipkart flipkart) {
        return flipkartservice.createproduct(flipkart);
    }

    //For PutMapping
    @PutMapping("/updateflipkart/{id}")
    public Flipkart createflipkart(@PathVariable("id") String id, @RequestBody Flipkart flipkart) {
        return flipkartservice.updateflipkart(flipkart, id);
    }

    //For DeleteMapping
    @DeleteMapping("/deletebyid/{id}")
    public void deleteflipkart(@PathVariable("id") String id) {
        flipkartservice.deletebyid(id);
    }

    //GetMapping
    @GetMapping("/getbyprice/{price}")
    public List<Flipkart> getproductbyprice(@PathVariable int price) {
        return flipkartservice.getByPrice(price);
    }


}












