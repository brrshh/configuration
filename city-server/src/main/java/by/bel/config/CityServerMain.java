package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories("by.bel.repo")
@ComponentScan({"by.bel.controller"})
//@EnableSpringDataWebSupport
public class CityServerMain {

    public static void main(String[] args) {
        SpringApplication.run(CityServerMain.class, args);
    }


}
