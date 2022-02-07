package com.example.demo.application.action_dic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.mapper.PushOneMapper;
import com.example.demo.domain.model.PushOneModel;

@RestController
@RequestMapping("action/three/push")
public class DictionaryOutputController {

	@Autowired
	InsertOnsen insertOnsen;
	
	@Autowired
	PushOneMapper pushOneMapper;
	
	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<PushOneModel> doThreePull() {
		PushOneModel onsen = new PushOneModel();
		int onsen_id = insertOnsen.getCategory();
		System.out.println("先ほど取得した温泉番号は" + onsen_id + "です。");
		onsen = pushOneMapper.findOne(onsen_id);
		System.out.println(onsen);
		return new ResponseEntity<>(onsen, HttpStatus.OK);
	}
	
}
