package com.junefw.infra.modules.book;

import java.util.List;

public interface BookService {
	
	int selectOneCount(BookVo vo) throws Exception;
	List<Book> selectList(BookVo vo) throws Exception; 
	int insert(Book dto) throws Exception;
	Book selectOne(BookVo vo) throws Exception;
	int update(Book dto) throws Exception;
	int updelete(BookVo vo) throws Exception;
	int delete(BookVo vo) throws Exception;
	
}
