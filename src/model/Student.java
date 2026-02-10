package model;
import java.util.Scanner;

public class Student {
	int phy,che,math,eng,hindi;
	 Student(int phy,int che,int math,int eng,int hindi){  //Constructor
		this.phy=phy;
		this.che=che;
		this.math=math;
		this.eng=eng;
		this.hindi=hindi;
	}
	  
	
	public void total_marks() {
		int obtain=phy+che+math+eng+hindi;
		System.out.println("total obtain marks :"+ obtain);
		
	}
	public void avgPercentage() {
		int total_subject=5;
		int obtain=phy+che+math+eng+hindi;
		int avgMarks= obtain/total_subject;
		System.out.println("Average_Percentage :"+ avgMarks+"%");
	}
	
	public void grade() {
		int total_subject=5;
		int obtain=phy+che+math+eng+hindi;
		int avgMarks= obtain/total_subject;
		if(avgMarks>=90 && avgMarks<=100) {
			System.out.println(" Grade : A+");
		}
		else if(avgMarks>=80 && avgMarks<90) {
			System.out.println("Grade : A");

		}
		else if(avgMarks>=70 && avgMarks<79) {
			System.out.println("Grade : B");

		}
		
		else if(avgMarks>=60 && avgMarks<69) {
			System.out.println("Grade : C");

		}
		else if(avgMarks>=50 && avgMarks<59) {
			System.out.println("Grade : D");

		}
		else {
			System.out.println("Fail");
		}

		
	}
	
	public void displayResult() {
		this.total_marks();
		this.avgPercentage();
		this.grade();
		
	}
	
	
	

}
