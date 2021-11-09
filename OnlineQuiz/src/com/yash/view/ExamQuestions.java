package com.yash.view;

import java.util.List;
import java.util.Scanner;
import com.yash.entity.Question;

public class ExamQuestions extends Thread{
	
	private static View vv=new View();
	static int score=0;
	static int attemp=0;
	static int correct=0;
	static boolean flag=true;
	
	public static void javaExamStart(List<Question> questions)
	{
		
		int answer=0;;
		System.out.println("************ NOTE ************");
		System.out.println("1. You only need to write the correct option number like(1/2/3/4).");
		System.out.println("2. Every correct answer give you 10% more score .");
		System.out.println("3. You have to attempt 10 questions in only 10 minutes to complete the test .");
		try(Scanner scanner=new Scanner(System.in))
		{
			String choice=null;
			System.out.println("=>If you want to start test press y orr if you want to exit press n (only y/n)");
			choice=scanner.next();
			if(!choice.equals("y"))
			{
			vv.examStart();
			}
			ExamQuestions eq=new ExamQuestions();
			System.out.println("Timer start..");
			eq.start();
			
			
		for(Question que:questions)
		{
			++attemp;
			System.out.println(que.getId()+". "+que.getQuestion());
			System.out.println(que.getOptionA());
			System.out.println(que.getOptionB());
			System.out.println(que.getOptionC());
			System.out.println(que.getOptionD());
			System.out.println("Give Answer");
			if(scanner.hasNextInt())
			{
			answer=scanner.nextInt();
			}
			else
			{
				scanner.next();
			}
			if(!flag)
			{
				break;
			}
			if(answer==Integer.parseInt(que.getCorrect()))
			{
				++correct;
				score+=10;
			}
			
		}
		timeOut();
		
		}
	}
	public static void timeOut()
	{
		System.out.println("=> Number of Question you attemp = "+attemp);
		System.out.println("=> Number of Correct answer = "+correct);
		System.out.println("=> Your Total Score = "+score+"%");
		System.out.println("=================================================================");
		vv.examStart();
	}
	@Override
	public void run() {
		try {
			
			Thread.sleep(30000);
			System.out.println("Time Out..");
			System.out.println("Press 1 to see the score.. ");
			ExamQuestions.flag=false;
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

}
