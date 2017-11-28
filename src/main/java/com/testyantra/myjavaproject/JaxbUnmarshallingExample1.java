package com.testyantra.myjavaproject;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshallingExample1 
{
	public static void main(String[] args) throws JAXBException
	{
		/**
		 * Convert above XML to JAVA Object using JAXB
		 * i.e. Unmarshalling
		 */
		
		JAXBContext ctx=JAXBContext.newInstance(StudentInfo.class);
		Unmarshaller unmarshaller=ctx.createUnmarshaller();
		Object obj=unmarshaller.unmarshal(new File("E:\\StudentData.xml"));
		StudentInfo info=(StudentInfo)obj;
		
		//Print the Object Data in Console
		System.out.println("Reg No.  :- "+info.getRegno());
		System.out.println("First Name  :- "+info.getFirstName());
		System.out.println("Last Name  :- "+info.getLastName());
	}
}
