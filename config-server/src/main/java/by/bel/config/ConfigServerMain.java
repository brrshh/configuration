package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

/**
 * Created by borino on 10.07.2016.
 */
@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
public class ConfigServerMain {


	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMain.class, args);
	}

	@Profile("git")
	static class GitConfiguration{



	}
}
