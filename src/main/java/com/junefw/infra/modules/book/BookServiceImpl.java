package com.junefw.infra.modules.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao dao;
	
	@Override
	public List<Book> selectList(BookVo vo) throws Exception {
		
		return dao.selecList(vo);
	}
	
	@Override
	public int insert(Book dto) throws Exception {
	
		return dao.insert(dto); 
	}
	
	@Override
	public int update(Book dto) throws Exception {
		return dao.update(dto);
	}
	
	@Override
	public int selectOneCount(BookVo vo) throws Exception {
		return dao.selectOneCount(vo);
	}
	
	@Override
	public Book selectOne(BookVo vo) throws Exception {
		return dao.selectOne(vo);
	}
	
	@Override
	public int updelete(BookVo vo) throws Exception {
		
		return dao.delete(vo);
	}
	
	@Override
	public int delete(BookVo vo) throws Exception {
		
		return dao.updateDelet(vo);
	}
	
	
	
	
}
