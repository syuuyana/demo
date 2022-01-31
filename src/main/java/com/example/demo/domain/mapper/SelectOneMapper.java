package com.example.demo.domain.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.model.SelectOneModel;

@Mapper // MyBatisが必要, 
public interface SelectOneMapper {
	
	// 特定のidからそのユーザの全ての情報を取得する関数
	@Select("SELECT select_id, one_first_times, one_second_times, one_third_times, select_one_date, category FROM select_one WHERE select_id = #{selectId}")
	SelectOneModel findOne(int selectId); // selectIdはJava側
	
	// そのテーブルの全ての情報を取得する関数
	@Select("SELECT select_id, one_first_times, one_second_times, one_third_times, select_one_date, category FROM select_one")
	SelectOneModel findAll();
	
	// idに応じて、データを格納する関数を作成
	@Options(useGeneratedKeys = true, keyProperty = "selectId") // 自動採番されたidを取得(@Optionはその許可)
	@Insert("INSERT INTO select_one (one_first_times, one_second_times, one_third_times, select_one_date, category) VALUES (#{oneFirstTimes}, #{oneSecondTimes}, #{oneThirdTimes}, #{selectOneDate}, #{category})")
	void insert(SelectOneModel one);
}