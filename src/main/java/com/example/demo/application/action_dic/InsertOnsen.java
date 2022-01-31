package com.example.demo.application.action_dic;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Data
@Component
@SessionScope
public class InsertOnsen {
	private int category;
}
