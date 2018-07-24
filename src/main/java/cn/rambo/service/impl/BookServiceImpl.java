package cn.rambo.service.impl;

import java.util.List;

import cn.rambo.domain.Book;
import cn.rambo.mapper.BookMapper;
import cn.rambo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
		
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}

}
