package by.bel.config;

import com.github.javafaker.Faker;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * Created by borino on 10.07.2016.
 */
@RestController
@RequestMapping("client")
@RefreshScope
public class ClientController {

    @Value("${client.messages}")
    private String mes;

    @RequestMapping("/getMes")
    public String getMes() throws InterruptedException {
        System.out.println("--------------- CALL   " + id);
        return mes + "  _  " + new Date();

    }

    @Value("${eureka.instance.instance-id}")
    private String id;

    @RequestMapping("/getAll_1")
    public String getAll() throws InterruptedException {

        Thread.currentThread().sleep(1000);
        System.out.println("--------------- CALL   " + id);
        return "this is all clients 1s " + new Date();

    }

    @RequestMapping("/getAll_r")
    public String getAllr() throws InterruptedException {
        Thread.currentThread().sleep(RandomUtils.nextInt(6) * 1000);
        return "this is all clients Randoms " + new Date();

    }

    private final Faker faker = new Faker();

    @RequestMapping("/getAll")
    public String getAll22() throws InterruptedException {
        faker.name().fullName();

        return "this is all clients Randoms " + new Date();

    }


}
