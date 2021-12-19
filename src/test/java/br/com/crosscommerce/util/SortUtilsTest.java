package br.com.crosscommerce.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class SortUtilsTest {

	@Test
	public void testMergeSort() {
		List<Double> unsortedList = List.of(5.231, 12.12, 9.0, 3.0, 15.0, 88.0);
		List<Double> sortedList = List.of(3.0, 5.231, 9.0, 12.12, 15.0, 88.0);
		assertNotEquals(sortedList, unsortedList);
		assertEquals(sortedList, SortUtils.mergeSort(unsortedList));
	}
}
