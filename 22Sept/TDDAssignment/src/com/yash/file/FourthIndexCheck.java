package com.yash.file;

import java.util.Arrays;

public class FourthIndexCheck {
	public int ReturnFourthLargest(int[] arr) 
	{
		Arrays.sort(arr);
		return arr[arr.length-4];
		
	}

}
