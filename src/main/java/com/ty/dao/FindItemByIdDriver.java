package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;
import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class FindItemByIdDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		FoodOrder res = entityManager.find(FoodOrder.class, 1);
		System.out.println(res.getId());
		System.out.println(res.getToname());
		System.out.println(res.getStatus());
		List<Item> items = res.getItems();

		if (items != null) {
			for (Item i : items) {
				System.out.println(i.getId());
				System.out.println(i.getName());
				System.out.println(i.getQuantity());
				System.out.println(i.getCost());
				System.out.println("***************************************");
			}
		}

	}
	

}
