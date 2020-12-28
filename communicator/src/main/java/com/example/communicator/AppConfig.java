package com.example.communicator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;

@Configuration
public class AppConfig {

	@Bean
	public FreeMarkerConfigurationFactory fileFactory() {
		FreeMarkerConfigurationFactory freeMarkerConfiguration = new FreeMarkerConfigurationFactory();
		freeMarkerConfiguration.setTemplateLoaderPath("classpath:/templates");
		freeMarkerConfiguration.setDefaultEncoding("UTF-8");
		return freeMarkerConfiguration;
	}

}
