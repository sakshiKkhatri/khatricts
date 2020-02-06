package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.model.Item;
import com.example.demo.repo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemRepository itemRepository;
 




	@Override
	@Transactional
	public List<Item> getAllItem() {
		
		return itemRepository.findAll();
	}




	@Override
	@Transactional
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}




	@Override
	public Optional<Item> getItemByItemId(String itemId) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemId);
	}



     @Override
	public void deleteByItemId(String itemId) {
		// TODO Auto-generated method stub
    	 itemRepository.deleteById(itemId);
	}









	



	@Override
	public void deleteByItemNameAndItemId(String itemName, String itemId) {
		// TODO Auto-generated method stub
		itemRepository.deleteByItemNameAndItemId(itemName, itemId);
	}







	
}
