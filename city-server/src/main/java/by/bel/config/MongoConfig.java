package by.bel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */
@Configuration
public class MongoConfig {

    @Value("city.mongo.host")
    String host;

    @Value("city.mongo.port")
    String port;

    @Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost(host);
        mongo.setPort(Integer.parseInt(port));

        System.out.println("------------------ " + mongo);
        return mongo;
    }
}
