package by.bel.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by borino on 10.07.2016.
 */
@RestController
public class ClientServiceImpl {

	@Autowired
	ClientService clientService;

	@RequestMapping("/one")
	public Map<String, String> infos() {
		Map<String, String> result = new HashMap<>();
		result.put("one", clientService.getOne());
//        result.put("two", clientService.getAll2());
//        result.put("three", clientService.getAll3());
		return result;
	}

	@RequestMapping("/mes")
	public Map<String, String> infos1() {
		return Collections.singletonMap("mes", clientService.getMes());
	}
}
