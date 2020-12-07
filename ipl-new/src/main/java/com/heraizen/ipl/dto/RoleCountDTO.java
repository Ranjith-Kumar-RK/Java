package com.heraizen.ipl.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleCountDTO {
	private String role;
	private long count;
}
