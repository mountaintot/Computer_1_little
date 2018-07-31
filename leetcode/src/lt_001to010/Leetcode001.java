package lt_001to010;

import java.util.HashMap;
import java.util.Map;

public class Leetcode001 {
	/**
	 * ����֮�� two sum
	 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
	 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
	 */
	
	//�����ƽⷨ
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
		 * ͨ����ϣ����п��ٲ�ѯ�������൱�ڱ������еĵڶ���
		 * forѭ��������ϣ����
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
