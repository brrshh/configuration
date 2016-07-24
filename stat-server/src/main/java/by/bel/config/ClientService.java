package by.bel.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by borino on 10.07.2016.
 */
@FeignClient(serviceId = "client-rest", fallback = ClientServiceFallback.class)
public interface ClientService {

    @RequestMapping(path = "/client/getOne", method = RequestMethod.GET)
    public String getOne();

    @RequestMapping(path = "/client/getMes", method = RequestMethod.GET)
    public String getMes();

}
