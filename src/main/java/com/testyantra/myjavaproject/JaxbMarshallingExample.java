package com.testyantra.myjavaproject;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbMarshallingExample 
{
	public static void main (String[] args) throws JAXBException
	{
		StudentInfo info=new StudentInfo();
		info.setRegno(127);
		info.setFirstName("Jyotiprakash");
		info.setLastName("Mohanty");
		
		//Convert the above Java Object to XML using JAXB		
		JAXBContext ctx= JAXBContext.newInstance(StudentInfo.class);
		Marshaller marshaller=ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(info, System.out);
		//marshaller.marshal(info, new File("StudentData.xml"));
		marshaller.marshal(info, new File("E:\\StudentData.xml"));
		
	} //End of Main
}//End of class
