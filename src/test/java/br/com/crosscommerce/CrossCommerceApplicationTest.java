package br.com.crosscommerce;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import br.com.crosscommerce.model.DataDTO;
import br.com.crosscommerce.service.DataService;

@SpringBootTest()
class CrossCommerceApplicationTest {

	@Autowired
	private DataService service;
	
	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private DataDTO data;
	
	@Test
	void test() {
		assertFalse(service == null);
		assertFalse(rest == null);
		assertFalse(data == null);
	}

}
