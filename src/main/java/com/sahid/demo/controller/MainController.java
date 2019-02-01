package com.sahid.demo.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import com.sahid.demo.model.Student;
import com.sahid.demo.repo.StudentRepository;
import com.sahid.demo.service.StudentService;

@Controller
public class MainController {

	@Autowired
	StudentService ss;

	@Autowired
	StudentRepository sr;

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("Messege");
		return "index";
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String studentform(Model model)
	{
		model.addAttribute("student", new Student());
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String studentsubmit(@ModelAttribute Student student, Model model) {
		model.addAttribute("student", student);
		
		if(student.getEmail()==null || student.getEmail().length() <= 0)
		{
			model.addAttribute("error1","Email is empty");
		}
		else
		{
			Student getresponseid=sr.save(student);
			if(getresponseid.getId()>0)
			{
				model.addAttribute("success","Data is inserted Successfully");
			}
			else
			{
				model.addAttribute("error2","Data not inserted");
			}
		}
		
		return "form";
	}

//	@RequestMapping("/load")
//	public String studentSubmit(@RequestParam("id") long id, Model model) {
//
//		model.addAttribute("student", ss.findOne(id));
//
//		return "load";
//	}

	@RequestMapping(value = "/load", method = RequestMethod.GET)
	public String studentSpecific(@RequestParam("id") long id, Model model) {

		model.addAttribute("customer", ss.findOne(id));

		return "load";
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String allData(Model model) {

		model.addAttribute("customer", ss.getAllStudentData());

		return "all";
	}
//    @RequestMapping(value="/load", method=RequestMethod.GET)
//    public String customerSubmit(@RequestParam("id") long id, Model model) {
//    	
//    	Student student = sr.findById(id).orElse(null);
//        model.addAttribute("customer", student);
//        
//        return "load";
//    }
}
