package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.Filter;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories("by.bel.repo")
@ComponentScan({"by.bel.controller"})
@Import(MongoConfig.class)
public class CityServerMain {

  public static void main(String[] args) {
    SpringApplication.run(CityServerMain.class, args);
  }

  @Bean
  public Filter logFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeQueryString(true);
    filter.setIncludeHeaders(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(5120);
    System.out.println("filter was added success.");
    return filter;
  }

}
