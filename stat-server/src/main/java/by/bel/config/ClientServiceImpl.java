package by.bel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by borino on 10.07.2016.
 */
@RestController
public class ClientServiceImpl {

    @Autowired
    ClientService clientService;

    @RequestMapping("/infos")
    public Map<String, String> infos() {
        Map<String, String> result = new HashMap<>();

        result.put("one", clientService.getAll1());
//        result.put("two", clientService.getAll2());
//        result.put("three", clientService.getAll3());
        return result;
    }

    @RequestMapping("/infos1")
    public Map<String, String> infos1() throws MyCustomException {
        MyCustomException exc = new MyCustomException("SSSSSSSSSSSSSSSSSSSSSSSS");
        exc.setCode("CODE=2");
        exc.setDescription("Descript=5");
        throw exc;
    }

    @ExceptionHandler
    public String exccc() {
        return " GGGGGGGGGAAAAAA GGGGGAAAA ";
    }

}
