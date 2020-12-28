package com.example.employeeStat.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String City;
	private String State;

	@Override
	public String toString() {
		return "[ City=" + City + ", State=" + State + " ]";
	}

}
