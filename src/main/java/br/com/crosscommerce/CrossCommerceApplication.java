package br.com.crosscommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import br.com.crosscommerce.model.DataDTO;
import br.com.crosscommerce.service.DataService;


@SpringBootApplication
public class CrossCommerceApplication {

	@Bean
    public DataService service() {
        return new DataService();
    }
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public DataDTO getSortedData() {
		return new DataDTO();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CrossCommerceApplication.class, args);
	}
	
	

	
}
