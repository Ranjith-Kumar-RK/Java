package com.example.communicator.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private String usn;
	private String name;
	private int semester;
	private List<Subjects> subjects;
	
}
