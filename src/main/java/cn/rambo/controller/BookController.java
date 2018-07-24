package cn.rambo.controller;

import java.util.List;

import cn.rambo.domain.Book;
import cn.rambo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@RequestMapping("/main")
	public String main(Model model) {
		List<Book> list = bookService.findAll();
		list.forEach(list1->System.out.println(list1.getName()));
		model.addAttribute("bookList", list);
		return "main";
	}
}
