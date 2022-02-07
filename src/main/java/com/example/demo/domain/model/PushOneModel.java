package com.example.demo.domain.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Data
@Component
@SessionScope
public class PushOneModel {
	private int pushId;
	private String pushName;
	private String iouStar;
	private String colorStar;
	private String tempStar;
	private String exp;
	private String quality;
	private String effect;
}

