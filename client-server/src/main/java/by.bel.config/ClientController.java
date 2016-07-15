package by.bel.config;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

/**
 * Created by borino on 10.07.2016.
 */
@RestController
@RequestMapping("client")
public class ClientController {

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


}
