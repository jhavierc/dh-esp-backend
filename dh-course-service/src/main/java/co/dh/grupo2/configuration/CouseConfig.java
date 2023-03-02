package co.dh.grupo2.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.dh.grupo2.service.ISuscriptionClient;
import co.dh.grupo2.service.impl.CourseService;

@Configuration
public class CouseConfig {

	@Autowired
	private ISuscriptionClient suscriptionClient;

	@Bean
	public CourseService initCouseService() {
		return new CourseService(suscriptionClient);
	}
}
