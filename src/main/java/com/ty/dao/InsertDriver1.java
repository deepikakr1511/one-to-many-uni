package com.ty.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class InsertDriver1 {

	public static void main(String[] args) {
		
		FoodOrder fo=new FoodOrder();
		fo.setToname("manoj");
		fo.setStatus("prepering");
		
		Item i=new Item();
		i.setName("pizza");
		i.setQuantity(2);
		i.setCost(500);
		
		Item i1=new Item();
		i1.setName("coco");
		i1.setQuantity(1);
		i1.setCost(100);
		
		List<Item> items=new ArrayList();
		items.add(i);
		items.add(i1);
		fo.setItems(items);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(fo);
		entityManager.persist(i);
		entityManager.persist(i1);
		entityTransaction.commit();
	}

}
