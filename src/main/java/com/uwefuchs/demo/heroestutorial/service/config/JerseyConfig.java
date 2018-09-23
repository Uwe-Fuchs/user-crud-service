package com.uwefuchs.demo.heroestutorial.service.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.uwefuchs.demo.heroestutorial.service.hello_demo_jersey.HelloService;
import com.uwefuchs.demo.heroestutorial.service.helper.CORSResponseFilter;
import com.uwefuchs.demo.heroestutorial.service.resource.HeroesResource;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(HelloService.class);
		register(HeroesResource.class);
		register(CORSResponseFilter.class);
	}
}