package com.example.demo.application.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/omikugi_2")
public class OmikugiTwoViewController {
	
	@RequestMapping(method = RequestMethod.GET)
	String doOmikugiTwo(Model model) {
		return "omikugi_2";
	}
	
}
