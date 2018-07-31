package array;

import java.util.Arrays;

import org.junit.Test;

public class ArrayPartition_561 {
	// private static int[] nums = {1,4,3,2};

	@Test
	public void arrayPairSum_Test() {
		int[] a = { 1, 4, 3, 2 };
		// int[] a = nums;
		int max = 0;
		int num = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					num = a[j + 1];
					a[j + 1] = a[j];
					a[j] = num;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
			max = max + a[i];
			i++;
		}

	}
	
	@Test
	public void arrayPairSum_Test_2() {
		int[] a = { 1, 4, 3, 2 };
		
		Arrays.sort(a);
		
		int max = 0;

		for (int i = 0; i < a.length; i+=2) {

//			System.out.println(a[i]);
			max = max + a[i];
			
		}
		
		System.out.println(max);

	}
	
	@Test
	public void arrayPairSum_Test_3(int[] nums) {
		int sum = 0;
		int[] map = new int[20001];
		boolean odd = true;
		for (int i = 0; i<nums.length;i++) {
			map[nums[i]+10000]++;
		}
		
		for (int i = 0; i < map.length; i++) {
			while(map[i]>0){
                if(odd) {
                    sum = sum + i - 10000;
                    
                }
                odd = !odd;
                map[i]--;
            }
		}
		
//	return sum;

	}

	public int arrayPairSum(int[] nums) {

		int[] a = nums;
		int max = 0;
		int num = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					num = a[j + 1];
					a[j + 1] = a[j];
					a[j] = num;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
			max = max + a[i];
			i++;
		}
		return max;
	}

}
