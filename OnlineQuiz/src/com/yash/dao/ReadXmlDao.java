package com.yash.dao;


import java.util.List;
import com.yash.entity.Question;
import com.yash.repository.QuestionRepo;

public class ReadXmlDao {
	
	public List<Question> readJavaCollectionXmlFile()
	{
		return QuestionRepo.readJavaCollectionXML();
	}
	
	public List<Question> readJavaMultiThreadingXmlFile()
	{
		return QuestionRepo.readJavaMultiThreadingXML();
	}
}
