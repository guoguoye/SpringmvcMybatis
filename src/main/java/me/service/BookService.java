package me.service;

import java.util.List;

import me.domain.Book;

/**
 * Book服务层接口
 * @author www
 *
 */
public interface BookService {
	/**
	 * 查找所有图书
	 * @return 返回图书集合
	 *
	 */
	List<Book> getAll();
}
