package com.example.demo.application.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/omikugi_3")
public class OmikugiThreeViewController {

	@RequestMapping(method = RequestMethod.GET)
	String doOmikugiThree(Model model) {
		return "omikugi_3";
	}
	
}
