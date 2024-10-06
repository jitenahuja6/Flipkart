package com.java.Flipkart.repository;

import com.java.Flipkart.model.Flipkart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FlipkartRepository extends MongoRepository<Flipkart, String> {

    List<Flipkart> getByPrice(int price);


}
