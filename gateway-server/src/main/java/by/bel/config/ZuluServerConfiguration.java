package by.bel.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

/**
 * Created by Barys_Shliaha on 15-Jul-16.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuluServerConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(ZuluServerConfiguration.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
