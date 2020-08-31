package mx.com.multiva.sipare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsarFileWorklogMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsarFileWorklogMicroserviceApplication.class, args);
	}

}
