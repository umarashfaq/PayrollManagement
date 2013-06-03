package com.umar.payroll.view;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.umar.payroll.domain.Person;
import com.umar.payroll.service.PersonService;

@Controller
@RequestMapping("/persons")
public class PersonController {
	private static final String VIEW_LIST = "/WEB-INF/pages/persons/list.jsp";
	private static final String VIEW_FORM = "/WEB-INF/pages/persons/form.jsp";
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping
	public String list(Model model) {
		model.addAttribute("persons", personService.list());
		return VIEW_LIST;
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String getEditForm(@RequestParam(required=false, defaultValue="-1") int id, Model model) {
		Person person = id < 0 ? new Person() : personService.findById(id);		
		model.addAttribute("command", person);
		return VIEW_FORM;
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String postEditForm(@ModelAttribute("command") @Valid Person person, BindingResult result) {
		
		if ( result.hasErrors() ) {
			return VIEW_FORM;
		} 
		
		if ( person.getId() > 0 ) {
			personService.merge(person);
		} else {
			personService.persist(person);
		}
		
		return "redirect:/persons";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {
		personService.delete(id);
		return "redirect:/persons";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Timestamp.class, new TimestampEditor(df));
	}
}
