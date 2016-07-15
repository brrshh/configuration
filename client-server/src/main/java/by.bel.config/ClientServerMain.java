package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

/**
 * Created by borino on 10.07.2016.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientServerMain {
	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientServerMain.class, args);
	}
}
