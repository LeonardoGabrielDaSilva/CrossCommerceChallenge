package br.com.crosscommerce.model;

import java.util.ArrayList;
import java.util.List;

public class DataDTO {

	private List<Double> numbers;

	public DataDTO() {
		numbers = new ArrayList<Double>();
	}

	public List<Double> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Double> numbers) {
		this.numbers = numbers;
	}

}
