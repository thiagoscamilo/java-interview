package com.java.interview;


import java.util.*;


public class Main {


	public static void main(String... args) {



	}

	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		// Write your code here.
		Arrays.sort(array);
		List<Integer[]> result = new ArrayList<>();
		//int [] array = new int[]{7, 6, 4, -1, 1, 2};
		// -1, 1, 2,4, 6, 7
		for(int i = 0; i < array.length ; i++){

			for(int j = i +1 ; j < array.length ; j++){

				int target = targetSum - (array[i] + array[j]);
				int start = j + 1;
				int last = array.length -1;

				while(start < last){
					if((array[start] + array[last]) > target){
						last--;
					}else if((array[start] + array[last]) < target){
						start++;
					}else{
						Integer[] list = new Integer[]{array[i],array[j],array[start],array[last]};
						result.add(list);
						break;
					}
				}

			}
		}
		return result;
	}

}
