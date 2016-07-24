package by.bel.config;

import org.springframework.stereotype.Component;

/**
 * Created by borino on 24.07.2016.
 */
@Component
public class ClientServiceFallback implements ClientService{

	@Override
	public String getOne() {
		return "return ONE From Fallback";
	}

	@Override
	public String getMes() {
		return "return MES from Fallback";
	}
}
