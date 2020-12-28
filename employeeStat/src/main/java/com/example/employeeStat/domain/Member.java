package com.example.employeeStat.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private String Name;
	private String Email;
	private Address Address;

	@Override
	public String toString() {
		return "Name=" + Name + ", Email=" + Email + ", Address=" + Address;
	}

}
