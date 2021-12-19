package br.com.crosscommerce.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.crosscommerce.model.DataDTO;

@Service
@EnableRetry
public class DataService {

	private static Logger log = LoggerFactory.getLogger(DataService.class);
	
	private final String DATAURI = "http://challenge.dienekes.com.br/api/numbers?page=";
	
	@Autowired
	private RestTemplate rest;

	@Retryable(HttpServerErrorException.class)
	public DataDTO getData(int count) {
		return rest.getForObject(DATAURI + count, DataDTO.class);
	}
	
	@Recover
	public DataDTO recoverFromData(HttpServerErrorException e, int count) {
		log.error("Falha ao tentar recuperar os dados da página: " + count + ". Passando para a próxima página.");
		return getData(count++);
	}
	

}
