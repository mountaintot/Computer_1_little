package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class PascalTriangle_118 {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();

		if (numRows == 0)
			return result;

		result.add(new ArrayList<>());
		result.get(0).add(1);

		for (int i = 1; i < numRows; i++) {
			List<Integer> list = new ArrayList<>();
			List<Integer> prerow = result.get(i-1);
			list.add(1);

			for (int j = 1; j < i; j++) {
				list.add(j, prerow.get(j - 1) + prerow.get(j));

			}
			list.add(1);
			result.add(list);
		}
		return result;
	}

	@Test
	public void generate_Test() {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(0, 1);
		result.add(0, list);
		list.clear();
		list.add(0, 1);
		// list.add(1, 1);
		result.add(1, list);

		System.out.println(result.size() + " " + result.get(0).size() + " " + result.get(1).size());

		for (Iterator it = result.iterator(); it.hasNext();) {
			List<Integer> integer = (List<Integer>) it.next();
			for (Integer it2 : integer) {
				System.out.println(it2.toString());
			}
		}

		// for (int i = 0; i < numRows; i++) {
		// for (int j = 0; j < numRows; j++) {
		//
		// }
		// }

	}

}
