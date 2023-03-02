package co.dh.ccepeda.cofiguration;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.dh.ccepeda.services.impl.SuscriptionService;

@Configuration
@EnableEurekaClient
public class SuscripcionConfig {
	
	
	@Bean
	public SuscriptionService initSuscriptionService() {
		return new SuscriptionService();
	}

}
