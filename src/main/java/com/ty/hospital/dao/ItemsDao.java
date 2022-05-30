package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Item;

public interface ItemsDao {
	Item saveItem(Item item,int medOrder_id );
	Item getItemById(int id);
	List<Item> getItemByMedOrderId(int medOrder_id);
	Item updateItem(Item item,int id)  ;
	boolean deleteItem(int id);
}
