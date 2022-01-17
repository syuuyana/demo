package com.example.demo.application.action;

import java.time.LocalDate;

import lombok.Data;

@Data // ViewとControllerのつなぎ役
public class InsertTimes {
	private int first_times;
	private int second_times;
	private int third_times;
	private LocalDate select_date;
	private int pushId;
}
