package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by borino on 10.07.2016.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMain {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMain.class, args);
	}
}
