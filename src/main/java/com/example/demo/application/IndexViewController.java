package com.example.demo.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/")
public class IndexViewController {

	@RequestMapping(method = RequestMethod.GET)
	String doIndex(Model model) {
		return "index";
	}
	
}
