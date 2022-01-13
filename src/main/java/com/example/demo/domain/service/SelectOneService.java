package com.example.demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.mapper.SelectOneMapper;
import com.example.demo.domain.model.SelectOneModel;


@Service // Service は業務処理を提供する(サービス層)
@Transactional // 「ここからここまでワンセット」な処理単位
public class SelectOneService {
	
	@Autowired // newの代わりに用いられる
	SelectOneMapper selectOneMapper;
	
	public void countOne(SelectOneModel one) {
		this.selectOneMapper.insert(one);
	}
}
