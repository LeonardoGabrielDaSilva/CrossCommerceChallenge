package br.com.crosscommerce.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.crosscommerce.model.DataDTO;

@SpringBootTest()
class DataServiceTest {
	
	@Autowired
	private DataService service;
	
	@Test
	public void testGetData() {
		try {
			DataDTO data = service.getData(1);
			assertEquals(data.getClass(), DataDTO.class);
			assertFalse(data.getNumbers().isEmpty());
		} catch (Exception ex) {
			fail(ex.getMessage());
		}
	}

}
