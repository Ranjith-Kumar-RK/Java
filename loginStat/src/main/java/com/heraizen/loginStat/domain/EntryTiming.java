package com.heraizen.loginStat.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntryTiming {

	private String StartTime;
	private String EndTime;
	private long Mintue;
	private long Hours;

}
