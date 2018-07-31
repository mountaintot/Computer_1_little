package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MajorityElement_169 {

	public int majorityElement(int[] nums) {
		
		List<Integer> list = new ArrayList<>();
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			list.set(i, 0);
		}
		
		for (int i = 0; i < nums.length; i++) {
			a = list.get(i);
			list.set(nums[i], a++);
		}
		Collections.sort(list);
		list.size();
		return 0;
	}
	
	@Test
	public void Test() {
		List<Integer> list = new ArrayList<>();
		System.out.println(list.get(0));
		
	}
}
