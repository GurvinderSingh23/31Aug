package com.yash.FirstAssignment;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.yash.SecondAssignment.ReadDataFromXml;

public class ValidateData {

	public static void main(String[] args) {
		String lang=XMLConstants.W3C_XML_SCHEMA_NS_URI;
		SchemaFactory sf=SchemaFactory.newInstance(lang);
		try {
			File file=new File("src\\com\\yash\\FirstAssignment\\student.xsd");
			File xmlFile=new File("src\\com\\yash\\FirstAssignment\\student.xml");
			if(!file.exists() && !xmlFile.exists()) {
				throw new IOException();
			}
			Schema schema=sf.newSchema(file);
			Validator val=schema.newValidator();
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db= dbf.newDocumentBuilder();
			Document doc=db.parse(xmlFile);
			DOMSource ds=new DOMSource(doc);
			val.validate(ds);
			System.out.println("File:"+xmlFile.getName());
			
			//Read Data From Xml With Sax Parser in com.yash.SecondAssignment.ReadDataFromXml
			new ReadDataFromXml().readXmlWithSaxParser(xmlFile);
			
					
		} catch (SAXException  | ParserConfigurationException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			System.err.println("files not found");
		}
	}
}
