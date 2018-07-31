package lt_001to010;

import java.util.HashMap;
import java.util.Map;

public class Leetcode001 {
	/**
	 * 两数之和 two sum
	 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
	 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	 */
	
	//暴力破解法
	//31 ms
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("no two sum");
    }
	
	//19 ms
	public int[] twoSum_1(int[] nums, int target) {
		/*
		 * 通过哈希表进行快速查询，作用相当于暴力法中的第二个
		 * for循环，但哈希更快
		 */
		Map<Integer, Integer> map = new  HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],i);
		}
		for (int i = 0; i < nums.length; i++) {
			int n =  target - nums[i];
			if(map.containsKey(n) && map.get(n) != i) {
				return  new  int[] {i,map.get(n)};
			}
		}
		throw new IllegalArgumentException("no two sum");
	}	
}
