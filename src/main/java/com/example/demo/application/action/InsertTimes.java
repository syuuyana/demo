package com.example.demo.application.action;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Data // ViewとControllerのつなぎ役
@Component
@SessionScope
public class InsertTimes {
	private int selectId;
	private int first_times;
	private int second_times;
	private int third_times;
	private LocalDate select_date;
	private int pushId;
}
