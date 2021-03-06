package com.scu.book.shop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.scu.book.shop.entity.Test;
import com.scu.book.shop.service.TestService;

/**
 * task col
 *  
 * @author lynch
 */
@Controller
@RequestMapping(value="/test")
public class TestCol {
	
	@Autowired
	private TestService testService;
	
	/**
	 * 列表
	 */	
	@RequestMapping(value = "list",method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "page", defaultValue = "1") int pageNumber,
			@RequestParam(value = "page.size", defaultValue = "1") int pageSize) {

		ModelAndView mv = new ModelAndView();
		Page<Test> tests  = testService.list(new PageRequest(pageNumber - 1, pageSize, Sort.Direction.DESC, "testId"));
		mv.addObject("tests",tests);
		mv.setViewName("test/testList");
		return mv;
	}
	
	/**
	 * 添加页面
	 */
	@RequestMapping(value = "testAdd", method = RequestMethod.GET)
	public String createForm() {

		return "test/testAdd";
	}
	
	/**
	 * 添加
	 */
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(Test test) {

		testService.save(test);
		return "redirect:/test/list";
	}

}
