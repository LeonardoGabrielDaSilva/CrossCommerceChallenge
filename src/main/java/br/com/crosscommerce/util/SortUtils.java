package br.com.crosscommerce.util;

import java.util.ArrayList;
import java.util.List;

public abstract class SortUtils {
	
	public static List<Double> mergeSort(List<Double> originalList) {
		List<Double> list1 = originalList.subList(0, originalList.size() / 2);
		List<Double> list2 = originalList.subList(originalList.size() / 2, originalList.size());
		List<Double> sortedList = new ArrayList<Double>();

		if (list1.size() > 1) {
			list1 = mergeSort(list1);
		}
		if (list2.size() > 1) {
			list2 = mergeSort(list2);
		}
		int count1 = 0, count2 = 0;
		while (true) {
			if (list1.get(count1) < list2.get(count2)) {
				sortedList.add(list1.get(count1));
				count1++;
			} else {
				sortedList.add(list2.get(count2));
				count2++;
			}
			if (count1 >= list1.size()) {
				for (; count2 < list2.size(); count2++) {
					sortedList.add(list2.get(count2));
				}
				break;
			} else if (count2 >= list2.size()) {
				for (; count1 < list1.size(); count1++) {
					sortedList.add(list1.get(count1));
				}
				break;
			}
		}
		return sortedList;
	}
}
