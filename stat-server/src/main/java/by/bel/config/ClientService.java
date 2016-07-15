package by.bel.config;

import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by borino on 10.07.2016.
 */
@FeignClient(serviceId = "client-rest")
public interface ClientService {

    @RequestMapping(path = "/client/getAll_1", method = RequestMethod.GET)
    public String getAll1();

    @RequestMapping(path = "/client/getAll_2", method = RequestMethod.GET)
    public String getAll2();

    @RequestMapping(path = "/client/getAll_3", method = RequestMethod.GET)
    public String getAll3();



}
