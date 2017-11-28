package com.testyantra.myjavaproject;

import java.util.ArrayList;
import java.util.List;

public class GenerateData 
{
	public static College generate()
	{
		StudentInfo info=new StudentInfo();
		info.setRegno(127);
		info.setFirstName("Jyotiprakash");
		info.setLastName("Mohanty");
		
		StudentInfo info2=new StudentInfo();
		info2.setRegno(126);
		info2.setFirstName("Prakash");
		info2.setLastName("Barik");
		
		StudentInfo info3=new StudentInfo();
		info3.setRegno(187);
		info3.setFirstName("Abhishek");
		info3.setLastName("Mohanty");
		
		List<StudentInfo> studentList=new ArrayList<StudentInfo>();
		studentList.add(info);
		studentList.add(info2);
		studentList.add(info3);
		
		College college=new College();
		college.setCollegeName("Test Yantra Basavanagudi");
		college.setStudentList(studentList);
		
		return college;
	}// End of Method
}//End of Class