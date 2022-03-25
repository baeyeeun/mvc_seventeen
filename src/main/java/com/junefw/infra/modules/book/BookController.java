package com.junefw.infra.modules.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookServiceImpl service;
	

	@RequestMapping(value = "/book/bookList")
	public String memberList(Model model, BookVo vo) throws Exception {

		List<Book> list = service.selectList(vo);
		model.addAttribute("list", list);

		
		return "book/bookList";
	}
	
	@RequestMapping(value = "/book/bookForm")
	public String memberForm(Model model) throws Exception {
		
		return "book/bookForm";
	}
	
	@RequestMapping(value = "/book/BookInst")
	public String bookInst(Book dto) throws Exception {
		
		service.insert(dto);
		
		return "";
	}
}
