package com.org.springboot.basics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping(path = "/books")
	public List<Book> getAllBooks() {
		
		return Arrays.asList(new Book(1, "Manu", "Java 8"));
	}
}
