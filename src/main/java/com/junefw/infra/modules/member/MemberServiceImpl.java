package com.junefw.infra.modules.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDao dao;
	
	@Override
	public List<Member> selectList(MemberVo vo) throws Exception {
		
		return dao.selecList(vo);
	}
	
	@Override
	public int insert(Member dto) throws Exception {
	
		return dao.insert(dto); 
	}
	
	@Override
	public int update(Member dto) throws Exception {
		return dao.update(dto);
	}
	
	@Override
	public int selectOneCount(MemberVo vo) throws Exception {
		return dao.selectOneCount(vo);
	}
	
	@Override
	public Member selectOne(MemberVo vo) throws Exception {
		return dao.selectOne(vo);
	}
	
	@Override
	public int updelete(MemberVo vo) throws Exception {
		
		return dao.delete(vo);
	}
	
	@Override
	public int delete(MemberVo vo) throws Exception {
		
		return dao.updateDelet(vo);
	}
	
	
	
	
}
