package com.testyantra.myjavaproject;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshallingExample2 
{
	public static void main(String[] args) throws JAXBException
	{
		/**
		 * Convert above XML to JAVA Object using JAXB
		 * i.e. Unmarshalling
		 */
		
		JAXBContext ctx=JAXBContext.newInstance(College.class);
		Unmarshaller unmarshaller=ctx.createUnmarshaller();
		Object obj=unmarshaller.unmarshal(new File("E:\\CollegeData.xml"));
		College info=(College)obj;
		
		//Print the Object Data in Console
		System.out.println("College Data  :-");
		System.out.println(info);
	}
}