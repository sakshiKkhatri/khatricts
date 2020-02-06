package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemRestController {

	/*
	 * private ItemRepository itemRepository;
	 * 
	 * @Autowired public ItemRestController(ItemRepository itemRepository) {
	 * super(); this.itemRepository = itemRepository; }
	 */
	
	private ItemService itemService;
	
	@Autowired
	public ItemRestController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}

	@PostMapping("/items")
	public Item create(@RequestBody Item item)
	{
		return itemService.createItem(item);
		
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems()
	{
		return itemService.getAllItem();
	}
	
	@GetMapping("/items/{itemId}")
	public Optional<Item> getItemByItemId(@PathVariable String itemId)
	{
		return itemService.getItemByItemId(itemId);
	}
	@DeleteMapping("/items/{itemId}")
	public void delete(@PathVariable String itemId)
	{
		itemService.deleteByItemId(itemId);
	}

	@PutMapping("/items")
	public Item update(@RequestBody Item item)
	{
		return itemService.createItem(item);
	}
    
	
    @DeleteMapping("/items/deleteItemByItemNameAndItemId/{itemName}/{itemId}")
    public void deleteByItemNameAndItemId(@PathVariable String itemName , @PathVariable String itemId )
   {
	itemService.deleteByItemNameAndItemId(itemName,itemId);
    	
    	
   }




}