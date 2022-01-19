package com.example.demo.application.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.mapper.PushOneMapper;
import com.example.demo.domain.mapper.SelectOneMapper;
import com.example.demo.domain.model.PushOneModel;
import com.example.demo.domain.model.SelectOneModel;
import com.example.demo.domain.service.PushOneService;

//import com.example.demo.domain.service.PullDataService;

@RestController
@RequestMapping("action/one/push")
public class GetActionController {
	
	@Autowired
	SelectOneMapper selectOneMapper;
	
	@Autowired
	PushOneMapper pushOneMapper;
	
	@Autowired
	PushOneService pushOneService;
	
	@Autowired
	InsertTimes insertTimes;
	
		@RequestMapping(method = RequestMethod.POST)
		ResponseEntity<String> doOnePush() {
			SelectOneModel select = new SelectOneModel();
			IndexSortingController sort = new IndexSortingController();
			PushOneModel push = new PushOneModel();
			OutputResult result = new OutputResult();
			
			// 入力部分
			int one_id = insertTimes.getSelectId();
			System.out.println("取得したIDは" + one_id + "です");
			SelectOneModel one_date = selectOneMapper.findOne(one_id);
			int i = one_date.getOneFirstTimes();
			int j = one_date.getOneSecondTimes();
		    int k = one_date.getOneThirdTimes();
		    System.out.println("取得した数字は" + i + "と" + j + "と" + k + "です");
			
			// 処理部分
			int return_one_id = sort.indexOneSorting(i, j, k);
			PushOneModel return_one_data = pushOneMapper.findOne(return_one_id);
			System.out.println(return_one_data);
			
			// 出力部分
			result.setPush_name(return_one_data.getPushName());
			System.out.println(return_one_data.getPushName());
			return new ResponseEntity<>(HttpStatus.OK);
		}
}
