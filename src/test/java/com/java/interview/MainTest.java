package com.java.interview;

import org.junit.Test;

import java.util.List;

public class MainTest {


	private void testTest(int [] array , int targetSum , String Testcase) throws Exception {

		List<Integer[]>  result = Main.fourNumberSum(array, targetSum);
		System.out.println(Testcase);
		for(Integer[] res : result){
			System.out.println(res[0] + " " + res[1] + " "+ res[2] + " "+ res[3]);
		}
	}

	@Test
	public void testCase1() throws Exception {
		int [] array = new int[]{7, 6, 4, -1, 1, 2};
		int targetSum = 16;
		String testCase = "Test Case 1";
		testTest(array,targetSum,testCase);
	}

	@Test
	public void testCase2() throws Exception {
		int [] array = new int[]{1, 2, 3, 4, 5, 6, 7};
		int targetSum = 10;
		String testCase = "Test Case 2";
		testTest(array,targetSum,testCase);
	}

}