package com.example.demo.application.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/omikugi")
public class OmikugiViewController {

	@RequestMapping(method = RequestMethod.GET)
	String doOmikugi(Model model) {
		return "omikugi";
	}
	
}
