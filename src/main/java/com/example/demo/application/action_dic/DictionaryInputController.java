package com.example.demo.application.action_dic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("action/three/pull")
public class DictionaryInputController {
	
	@Autowired
	InsertOnsen insertOnsen;

	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<String> doThreePull(@RequestBody InsertOnsen body) {
		int onsen_id = body.getCategory();
		//pushOneModel.setPushId(onsen_id);
		return new ResponseEntity<>(HttpStatus.OK); // status code 200
	}
	
}
