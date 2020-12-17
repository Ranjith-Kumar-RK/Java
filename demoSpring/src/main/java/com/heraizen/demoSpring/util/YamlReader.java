package com.heraizen.demoSpring.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

@Component
public class YamlReader {
	public <T> List<T> loadAndConvert(Class<?> t, String fileName) {
		Yaml yaml = new Yaml(new Constructor(t));
		List<T> list = new ArrayList<>();
		Iterable<Object> itr = yaml.loadAll(this.getClass().getResourceAsStream(fileName));
		for (Object object : itr) {
			@SuppressWarnings("unchecked")
			T ele = (T) object;
			list.add(ele);
		}
		return list;

	}

}
