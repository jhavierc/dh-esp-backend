package co.dh.grupo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DhEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhEurekaServerApplication.class, args);
	}

}
