package io.spring.mongo.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Books")
public class Book {
	
	private int id;
	private String name;
	private String author;
	private int pages;
	private double price;
	

}
