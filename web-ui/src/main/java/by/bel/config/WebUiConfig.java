package by.bel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Barys_Shliaha on 22-Jul-16.
 */

@SpringBootApplication
@ComponentScan("by.bel.config.ui")
public class WebUiConfig {

    public static void main(String[] args) {
        SpringApplication.run(WebUiConfig.class, args);
    }
}
