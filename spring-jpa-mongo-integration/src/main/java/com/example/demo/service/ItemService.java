package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Item;

public interface ItemService {
public List<Item>getAllItem();
public Item createItem(Item item);
public Optional<Item> getItemByItemId(String itemId);
public void deleteByItemId(String itemId);
public void deleteByItemNameAndItemId(String itemName, String itemId);

}
