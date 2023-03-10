package co.dh.grupo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DhApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhApiGatewayApplication.class, args);
	}

}
