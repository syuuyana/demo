package com.example.demo.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.model.PushOneModel;

@Mapper
public interface PushOneMapper {
	
	// 特定のidからそのユーザの全ての情報を取得する関数
	@Select("SELECT push_id, push_name, iou_star, color_star, temp_star, exp, quality, effect FROM push_one WHERE push_id = #{pushId}")
	PushOneModel findOne(int pushId);
	
	//findById
	//@Select("SELECT push_id, push_name, select_id FROM push_one WHERE select_id = #{selectId}")
	//List<PushOneModel> findByPushOneId(int selectId);
	
	
}

//CREATE TABLE IF NOT EXISTS push_one (
//		push_id SERIAL NOT NULL,
//		push_name TEXT,
//		PRIMARY KEY (push_id)
//);
