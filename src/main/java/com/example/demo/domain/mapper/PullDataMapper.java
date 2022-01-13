package com.example.demo.domain.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PullDataMapper {

	//@Select("SELECT pull_id, pull_name, select_id FROM pull_data WHERE select_id > #{dateTime} ORDER BY post_date_time DESC")
}

//CREATE TABLE IF NOT EXISTS pull_data (
		//pull_id SERIAL NOT NULL,
		//pull_name  VARCHAR(256)
	//);
