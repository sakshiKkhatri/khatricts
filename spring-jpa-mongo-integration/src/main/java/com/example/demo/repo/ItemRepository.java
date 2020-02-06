package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.demo.model.Item;

public interface ItemRepository extends MongoRepository<Item, String>{
	public Optional<Item> getItemByItemId(String itemId);
	public Optional<Item> deleteItemByItemId(String itemId);
    
	public List<Item> findByItemNameAndItemId(String itemName,String itemid);

	public void deleteByItemNameAndItemId(String itemName, String itemId);

}



