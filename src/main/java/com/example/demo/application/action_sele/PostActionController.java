package com.example.demo.application.action_sele;

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
@RequestMapping("action/one/pull")
public class PostActionController {
	
	@Autowired
	SelectOneService selectOneService;
	
	@Autowired // DI(依存性注入)のためのインターフェース
	InsertTimes insertTimes;
	
	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<String> doOnePull(@RequestBody InsertTimes body) { // @RequestBodyでApp本体がjson形式でデータを受信
		SelectOneModel select = new SelectOneModel(); // 新しいデータが入ってくる
		
		//System.out.println(select);
		//final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"); // その時に日付のフォーマットを指定
		//final LocalDate selectDate  = LocalDate.parse(body.getSelect_date(),  formatter);
		//System.out.println(selectDate);
		// SelectOneModelに挿入
		//System.out.println(body.getSelect_date());
		
		// 入力部分
		int i = body.getFirst_times();
		int j = body.getSecond_times();
		int k = body.getThird_times();
		int category = body.getCategory();
		select.setOneFirstTimes(i);
		select.setOneSecondTimes(j);
		select.setOneThirdTimes(k);
		select.setCategory(category);
		select.setSelectOneDate(body.getSelect_date());
		//System.out.println(body.getSelectId());
		selectOneService.countOne(select); // selectId生成
		int one_id = select.getSelectId();
		System.out.println("取得したIDは" + one_id + "です1-1");
		insertTimes.setSelectId(one_id);
		insertTimes.setFirst_times(i);
		insertTimes.setSecond_times(j);
		insertTimes.setThird_times(k);
		insertTimes.setCategory(category);
		insertTimes.setSelect_date(body.getSelect_date());
		
		System.out.println("取得したIDは" + one_id + "です1-2");
		return new ResponseEntity<>(HttpStatus.OK); // status code 200
	}
}
