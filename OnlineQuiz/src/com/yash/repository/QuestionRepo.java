package com.yash.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.yash.entity.Question;

public class QuestionRepo {
	public static List<Question>  javaQuestion;

	public static List<Question> readJavaCollectionXML()
	{
		String filePath= "C:\\Users\\gurvinder.singh\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\OnlineQuiz\\src\\JavaCollection.xml";
		return getQuestion(filePath);
		
	}
	public static List<Question> readJavaMultiThreadingXML()
	{
		String filePath= "C:\\Users\\gurvinder.singh\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\OnlineQuiz\\src\\JavaMultithreading.xml";
		return getQuestion(filePath);
	}
	
	public static List<Question> getQuestion(String filePath)
	{
		File xmlFile=new File(filePath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		
		try {
			db=dbf.newDocumentBuilder();
			Document doc = db.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("questions");
			javaQuestion = new ArrayList<Question>();
			for (int i = 0; i < nodeList.getLength(); i++)
			{  
				javaQuestion.add(get(nodeList.item(i),i));
			}
			
		}catch (SAXException | ParserConfigurationException | IOException   e)
		{
			e.printStackTrace();
		}
		return javaQuestion;
	}
	
	
	 private static Question get(Node node,int i) {
		    
	        Question Que = new Question();
	        if (node.getNodeType() == Node.ELEMENT_NODE) {
	            Element element = (Element) node;
	            Que.setId(Integer.parseInt(element.getAttribute("id")));
	            Que.setQuestion(getTagValue("question", element));
	            Que.setOptionA(getTagValue("option1", element));
	            Que.setOptionB(getTagValue("option2", element));
	            Que.setOptionC(getTagValue("option3", element));
	            Que.setOptionD(getTagValue("option4", element));
	            Que.setCorrect(getTagValue("correct", element));
	        }
	        return Que;
	    }
	 private static String getTagValue(String tag, Element element) {
	        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
	        Node node = (Node) nodeList.item(0);
	        return node.getNodeValue();
	    }
	
	
	
}
