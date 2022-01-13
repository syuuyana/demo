package com.example.demo.application.action;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.SelectOneModel;
import com.example.demo.domain.service.SelectOneService;

@RestController // JsonやXML等を返すWebAPI用のコントローラ. Viewに遷移しないのでメソッドの戻り値はレスポンスのコンテンツになる。
@RequestMapping("action/one")
public class PostActionController {
	
	@Autowired
	SelectOneService selectOneService;
	
	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<String> doOne(@RequestBody InsertTimes body) { // @RequestBodyでApp本体がjson形式でデータを受信
		SelectOneModel select = new SelectOneModel(); // 新しいデータが入ってくる
		System.out.println(select);
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"); // その時に日付のフォーマットを指定
		final LocalDateTime selectDate  = LocalDateTime.parse(body.getSelect_date(),  formatter);
		System.out.println(selectDate);
		// SelectOneModelに挿入
		int t = body.getFirst_times();
		System.out.println(t);
		select.setOneFirstTimes(t);
		
		selectOneService.countOne(select);
		
		return new ResponseEntity<>(HttpStatus.OK); // status code 200
	}
}
