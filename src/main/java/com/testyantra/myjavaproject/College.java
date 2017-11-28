package com.testyantra.myjavaproject;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class College 
{
	@XmlElement(name="college-name")
	private String collegeName;
	
	@XmlElementWrapper(name="student-list")
	@XmlElement(name="student-info")
	private List<StudentInfo> studentList;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public List<StudentInfo> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<StudentInfo> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", studentList=" + studentList + "]";
	}
}
