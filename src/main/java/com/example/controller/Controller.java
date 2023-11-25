package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Book;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String getBookData(Model model)
	{
		Book b=new Book(1,"java",45.90);
		Book b1=new Book(3,"sql",45.90);
		Book b2=new Book(2,"spring",45.90);
		Book b3=new Book(4,"c++",45.90);
		Book b4=new Book(5,"aws",45.90);
		List<Book> bl=new ArrayList<>();
		bl.add(b3);
		bl.add(b2);
		bl.add(b);
		bl.add(b1);
		bl.add(b4);
		model.addAttribute("bl", bl);
		return "search";
	}
}
