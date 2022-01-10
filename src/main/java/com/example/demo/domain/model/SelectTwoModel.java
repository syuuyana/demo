package com.example.demo.domain.model;

import java.time.LocalDate;

import lombok.Data;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
public class SelectTwoModel {
	private int selectId;
	private int twoFirstTimes;
	private int twoSecondTimes;
	private int twoThirdTimes;
	private LocalDate selectOneDate;
}
