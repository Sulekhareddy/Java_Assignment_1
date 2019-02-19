package assignment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {

		NamesList namesList = new NamesList();

		List<String> names = new ArrayList<>();
		names.addAll(namesList.getNames());

		Collections.sort(names);

		for (String nameList : names) {
			System.out.println(nameList);
		}

	}

}
