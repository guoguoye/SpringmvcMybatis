package me.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import me.domain.Book;

/**
 * @author www
 *
 */
public interface BookMapper {
	
	/**
	 * 查询所有图书
	 * @return 返回图书集合
	 */
	@Select("select * from tb_book")
	List<Book> fingAllBook();
	
}
