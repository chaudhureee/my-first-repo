package com.crud.srinjoy.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.srinjoy.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
