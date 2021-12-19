package br.com.crosscommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crosscommerce.model.DataDTO;
import br.com.crosscommerce.service.DataService;
import br.com.crosscommerce.util.SortUtils;

@RequestMapping(value = "/api")
@RestController
public class CSController {

	private static Logger log = LoggerFactory.getLogger(CSController.class);

	@Autowired
	private DataService service;

	@Autowired
	private DataDTO data;

	@RequestMapping(value = "/data")
	public DataDTO getData() {
		if(data.getNumbers().isEmpty()) {
			log.info("Dados ainda não definidos");
			updateData();
		}
		log.info("Retornado dados armazenados");
		return data;
	}

	@RequestMapping(value = "/update")
	public DataDTO updateData() {
		this.data.getNumbers().clear();
		log.info("Buscando dados da CrossCommerce (Pode levar alguns minutos...)");
		int count = 0;
		DataDTO currentData = null;
		do {
			currentData = service.getData(++count);
			this.data.getNumbers().addAll(currentData.getNumbers());
		} while (!currentData.getNumbers().isEmpty());
		this.data.setNumbers(SortUtils.mergeSort(this.data.getNumbers()));
		log.info("Finalizada busca pelos dados");
		return this.data;
	}

}
