package by.bel.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

/**
 * Created by Barys_Shliaha on 11-Jul-16.
 */
@Service("myErrorDecoder")
public class MyErrorDecoder implements ErrorDecoder {


    @Override
    public MyCustomException decode(String s, Response response) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(response.body().asInputStream(), MyCustomException.class);
        } catch (IOException e) {
            System.out.println("Failed to process response body");
            throw new RuntimeException("Failed to process response body.", e);
        }
    }
}
