package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by borino on 10.07.2016.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinStreamServer
public class ZipkinServerMain {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerMain.class, args);
	}
}
