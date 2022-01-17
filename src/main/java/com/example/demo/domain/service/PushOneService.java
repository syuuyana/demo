package com.example.demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.mapper.PushOneMapper;
import com.example.demo.domain.model.PushOneModel;

@Service
public class PushOneService {
	
	@Autowired
	PushOneMapper pushOneMapper;
	
		public PushOneModel getReturnOne(PushOneModel push_one) {
			PushOneModel return_one = this.pushOneMapper.findOne(push_one.getPushId());
			return return_one;
		}
}
