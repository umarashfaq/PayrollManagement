package com.umar.payroll.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.umar.payroll.dao.DepartmentDAO;

@Controller
public class HelloController {
	private DepartmentDAO departmentDAO;
	
	@RequestMapping("/")	
	public String index() {
		return "/WEB-INF/pages/index.jsp";
	}
}
