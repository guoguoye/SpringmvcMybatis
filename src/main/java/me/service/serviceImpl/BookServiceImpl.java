package me.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.domain.Book;
import me.mapper.BookMapper;
import me.service.BookService;


/**
 * BookService 接口fingAll方法实现
 * @service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 *
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

	/**
	 * @Autowired 自动注入BookMapper
	 *
	 */
	@Autowired
	private BookMapper bookMapper;
	
	/**
	 * BookService 接口getAll方法实现
	 * @see { BookService}
	 */
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookMapper.fingAllBook();
	}

}
