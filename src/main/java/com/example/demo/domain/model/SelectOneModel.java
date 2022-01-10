package com.example.demo.domain.model;

import java.time.LocalDate;

import lombok.Data;

@Data // ロンボク(アノテーションによるコード自動生成を行うライブラリ)
public class SelectOneModel {
	private int selectId;
	private int oneFirstTimes;
	private int oneSecondTimes;
	private int oneThirdTimes;
	private LocalDate selectOneDate;
}
