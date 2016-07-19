package by.bel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

/**
 * Created by borino on 10.07.2016.
 */
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
@EnableConfigServer
//@EnableDiscoveryClient
public class ConfigServerMain {


	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMain.class, args);
	}

}
