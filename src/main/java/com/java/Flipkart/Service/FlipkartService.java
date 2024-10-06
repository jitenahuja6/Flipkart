package com.java.Flipkart.Service;

import com.java.Flipkart.model.Flipkart;
import com.java.Flipkart.repository.FlipkartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class FlipkartService {

    @Autowired
    private FlipkartRepository flipkartrepository;

    //For GetMapping All
    public List<Flipkart> getAllFlipkart() {
        return flipkartrepository.findAll();
    }

    //For GetMapping with one particular id
    public Optional<Flipkart> getwithparticularid(String id) {
        return flipkartrepository.findById(id);
    }

    //For PostMapping

    public Flipkart createproduct(Flipkart flipkart) {
        return flipkartrepository.save(flipkart);
    }

    //For PutMapping

    public Flipkart updateflipkart(Flipkart flipkart, String id) {
        Optional<Flipkart> flipobj = flipkartrepository.findById(id);
        if (flipobj.isPresent()) {
            Flipkart flip = flipobj.get();
            flip.setPrice(flipkart.getPrice());
            flip.setManufacturelocation(flipkart.getManufacturelocation());
            return flipkartrepository.save(flip);
        } else {
            return null;
        }

    }

    //For DeleteMapping

    public void deletebyid(String id) {
        flipkartrepository.deleteById(id);
    }

    //For Custom

    public List<Flipkart> getByPrice(int price) {
        return flipkartrepository.getByPrice(price);
    }


}
