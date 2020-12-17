package com.heraizen.demoSpring.util;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.heraizen.demoSpring.domain.Player;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Configuration
@ConfigurationProperties(prefix = "ipl")

public class LoadSeedData {

	private List<Player> players;

}
