package com.jspiders.roxilerassessment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	private boolean sold;
	private String dateOfSale;
}
