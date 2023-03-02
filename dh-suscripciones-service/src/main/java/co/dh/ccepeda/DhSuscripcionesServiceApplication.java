package co.dh.ccepeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DhSuscripcionesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhSuscripcionesServiceApplication.class, args);
	}

}
