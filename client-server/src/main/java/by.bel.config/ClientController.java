package by.bel.config;

import com.github.javafaker.Faker;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by borino on 10.07.2016.
 */
@RestController
@RequestMapping("client")
@RefreshScope
public class ClientController {

    @Value("${client.messages}")
    private String mes;

    @Value("${eureka.instance.instance-id}")
    private String id;

    @RequestMapping("/getMes")
    public String getMes() throws InterruptedException {
        System.out.println("--------------- CALL getMes  " + id);
        return mes + "  _  " + new Date();
    }

    private final Faker faker = new Faker();

    @RequestMapping("/getOne")
    public String getAll22() throws InterruptedException {
        faker.name().fullName();
        Thread.currentThread().sleep(RandomUtils.nextInt(400));
        System.out.println("--------------- CALL getOne   " + id);
        return "this is all clients Randoms " + new Date();

    }


}
