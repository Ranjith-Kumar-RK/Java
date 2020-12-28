package com.example.communicator.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subjects {

	private String subName;
	private double score;
	private double passScore;
	private String result;

}
