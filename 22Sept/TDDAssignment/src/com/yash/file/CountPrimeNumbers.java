package com.yash.file;
import java.util.Scanner;
import java.util.ArrayList;

public class CountPrimeNumbers {
	public ArrayList<Integer> countPrimeNo1(int[] itr)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i : itr)
		{
			//System.out.println(+i+"\n --iterating : ");  
			
			int count = 0;

			for(int j=i;j>=1;j--)
			{

				if(i%j==0)
				{
					//System.out.println("count ++ because "+j);
					count+=1;
				}
			}
			if(count<3)
			{
				//System.out.println("\n adding "+i+"\n");
				primes.add(i);
			}
		}
		return primes;
	}
}
