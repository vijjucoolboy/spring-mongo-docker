package io.spring.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.spring.mongo.dto.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
