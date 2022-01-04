package com.example.demo.application.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/ten")
public class TenViewController {

	@RequestMapping(method = RequestMethod.GET)
	String doTen(Model model) {
		return "ten";
	}
	
}