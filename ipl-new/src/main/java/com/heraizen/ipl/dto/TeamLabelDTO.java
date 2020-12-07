package com.heraizen.ipl.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamLabelDTO {

	private List<String> labels;
}
