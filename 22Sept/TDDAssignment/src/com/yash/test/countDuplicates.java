package com.yash.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.file.StringDuplicates;

public class countDuplicates {
	StringDuplicates sd = null;

	@Before
	public void setUp() throws Exception 
	{
		sd = new StringDuplicates();
	}

	@After
	public void tearDown() throws Exception 
	{
		sd=null;
	}

	@Test
	public void test()
	{
		ArrayList<String> checkDuplicates=new ArrayList<String>();
		checkDuplicates.add("00");
		checkDuplicates.add("11");
		checkDuplicates.add("22");
		checkDuplicates.add("33");
		checkDuplicates.add("00");
		//System.out.println(Duplicates);
		ArrayList<String> expected=new ArrayList<String>(Arrays.asList("00","00"));
		ArrayList<String> check = sd.returnDuplicates(checkDuplicates,checkDuplicates.size());
		assertEquals(expected, check);
	}

}
