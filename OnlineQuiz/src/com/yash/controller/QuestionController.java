package com.yash.controller;

import java.util.List;

import com.yash.dao.ReadXmlDao;
import com.yash.entity.Question;
import com.yash.view.ExamQuestions;

public class QuestionController {
	ReadXmlDao rxd=new ReadXmlDao();
	public void collectionJavaExamStart()
	{
		List<Question> questions=rxd.readJavaCollectionXmlFile();
		ExamQuestions.javaExamStart(questions);
	}
	public void multithreadingJavaExamStart()
	{
		List<Question> questions=rxd.readJavaMultiThreadingXmlFile();
		ExamQuestions.javaExamStart(questions);
		
	}
}
