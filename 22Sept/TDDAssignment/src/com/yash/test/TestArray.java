package com.yash.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.file.FourthIndexCheck;

public class TestArray {
	private FourthIndexCheck getInt = null;

	@Before
	public void setUp() throws Exception {
		getInt = new FourthIndexCheck();
	}

	@After
	public void tearDown() throws Exception {
		getInt = null;
	}

	@Test
	public void test() {
		int[] arr = {1,2,3,4,5,6,23,23,21,43,23};
		int check = getInt.ReturnFourthLargest(arr);
		assertTrue(check>5);
	}

}
