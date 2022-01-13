package com.example.demo.application.action;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.domain.service.PullDataService;

@RestController
public class GetActionController {
	ResponseEntity<String> doPull() {
		
		
		// selectoneのidに基づいたデータをとる
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
