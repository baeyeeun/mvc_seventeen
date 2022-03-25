package com.junefw.infra.modules.book;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	@Inject
	@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	
	private static String namespace = "com.junefw.infra.modules.book.BookMpp";

	public int selectOneCount(BookVo vo) { return sqlSession.selectOne(namespace + ".selectOneCount", vo);}
	public List<Book> selecList(BookVo vo) { List<Book> list = sqlSession.selectList(namespace + ".selectList", vo); return list; }
	public int insert(Book dto) {return sqlSession.insert(namespace + ".insert", dto);}
	public Book selectOne(BookVo vo) { return sqlSession.selectOne(namespace + ".selectOne", vo);}
	public int update(Book dto) { return sqlSession.update(namespace + ".update", dto); }
	public int delete(BookVo vo) { return sqlSession.delete(namespace + ".delete", vo); }
	public int updateDelet(BookVo vo) { return sqlSession.update(namespace + ".updateDelet", vo); }
	
}
