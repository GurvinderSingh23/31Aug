package com.yash.SecondAssignment;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class StudentHandler extends DefaultHandler {
	
	   boolean rollNo=false;
	   boolean firstName = false;
	   boolean lastName = false;
	   boolean phoneNumber=false;
	   boolean totalMarks = false;
	   private double marks=0;
	   private StringBuilder name = new StringBuilder();
	 
	   @Override
	   public void startElement(String uri, 
	      String localName, String qName, Attributes attributes)
	         throws SAXException {
	      if (qName.equalsIgnoreCase("student")) {
	         String rollNo = attributes.getValue("rollno");
	         System.out.println("Roll No : " + rollNo);
	      } else if (qName.equalsIgnoreCase("firstname")) {
	    	  firstName = true;
	      } else if (qName.equalsIgnoreCase("lastname")) {
	    	  lastName = true;
	      }else if (qName.equalsIgnoreCase("phonenumber")) {
		      phoneNumber = true;
		  }else if (qName.equalsIgnoreCase("totalmarks")) {
	    	  totalMarks = true;
	      }
	   }
	 
	   
	   	@Override
	   	public void characters(char[] ch, int start, int length) throws SAXException {
	   		
	   		if(rollNo) {
	   			System.out.println("Roll No : "+ new String(ch,start,length));
	   			rollNo=false;
	   		}
	   		else if(firstName) {
	   			String fname = new String(ch,start,length);
	   			name.append(fname).append(" ");
	   			firstName=false;
	   		}
	   		else if(lastName) {
	   			String lname=new String(ch,start,length);
	   			name.append(lname);
	   			System.out.println("Name : "+name);
	   			lastName=false;
	   		}
	   		else if(totalMarks) {
	   			String string = new String(ch,start,length);
	   			marks = Double.parseDouble(string);
	   			System.out.println("Total Marks : "+marks);
	   			totalMarks=false;
	   		}
	   	}
	   	
	   	@Override
	   	public void endElement(String uri, String localName, String qName) throws SAXException {
	   		if(qName.equalsIgnoreCase("Student")) {
	   			double percentage = (marks/600)*100;
	   			System.out.printf("Percentage: %.2f \n",percentage);
	   			marks=0.0;
	   			if(percentage >= 90) {
	   				System.out.println("Grade - A");
	   			}
	   			else if(percentage >= 80 && percentage < 90) {
	   				System.out.println("Grade - B");			
	   			}
	   			else if(percentage >= 70 && percentage < 80) {
	   				System.out.println("Grade - C");			
	   			}
	   			else if(percentage >= 60 && percentage < 70) {
	   				System.out.println("Grade - D");			
	   			}
	   			else if(percentage >= 50 && percentage < 60) {
	   				System.out.println("Grade - E");			
	   			}
	   			else if(percentage >= 40 && percentage < 50) {
	   				System.out.println("Grade - F");			
	   			}
	   			
	   			name.delete(0, name.length());
	   		}
	   	}
	   	
	   }
   
	   
	   