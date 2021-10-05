package com.yash.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.file.CountPrimeNumbers;

public class TestPrimes {
	CountPrimeNumbers getPrime = null;
	@Before
	public void setUp() throws Exception 
	{
	getPrime = new CountPrimeNumbers();
	}

	@After
	public void tearDown() throws Exception 
	{
	getPrime = null;
	}

	@Test
	public void test() 
	{
		int[] itr = {1,12,3,16,17,9};
		ArrayList<Integer> prime = getPrime.countPrimeNo1(itr);
		//System.out.println(prime);
		ArrayList<Integer> expected =new ArrayList<Integer>(Arrays.asList(1,3,17));
		assertEquals(expected , prime);
	}

}
