package com.example.demo.application.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/result_dic")
public class ResultDictionaryViewController {

	@RequestMapping(method = RequestMethod.GET)
	String doResultDictionary(Model model) {
		return "result_dic";
	}
	
}
