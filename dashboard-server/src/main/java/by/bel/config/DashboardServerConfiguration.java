package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by borino on 24.07.2016.
 */

@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
public class DashboardServerConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(DashboardServerConfiguration.class, args);
	}
}
