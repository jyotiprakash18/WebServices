package com.testyantra.myjavaproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student-info")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlAccessorType(XmlAccessType.PROPERTY)
//@XmlAccessorType(XmlAccessType.NONE)
public class StudentInfo
{
	@XmlAttribute
	//@XmlElement(name="regno")
	private int regno;
	
	@XmlElement(name="first-name")
	private String firstName;
	
	@XmlElement(name="last-name")
	private String lastName;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	
	//@XmlElement(name="first-name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//@XmlElement(name="last-name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "StudentInfo [regno=" + regno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
