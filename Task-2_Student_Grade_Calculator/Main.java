package model;

import java.util.Scanner;
import model.*;

public class Main {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the physics marks");
		int phy=sc.nextInt();
		
		System.out.println("Enter the chemistry marks");
		int che=sc.nextInt();
		
		System.out.println("Enter the math marks");
		int math=sc.nextInt();
		
		System.out.println("Enter the english marks");
		int eng=sc.nextInt();
		
		System.out.println("Enter the hindi marks");
		int hindi=sc.nextInt();
		
		Student s=new Student( phy, che, math, eng, hindi); //create object of class Student
		int choice;
		do {
			System.out.println("*************M E N U*******************");
			System.out.println("1. Calcuate total Marks ");
			System.out.println("2. Calcuate average percentage ");
			System.out.println("3. Show grade ");
			System.out.println("4. Display total Results ");
			System.out.println("5. Do you Want to exit ");
			System.out.println("Enter your choice : ");
			 choice =sc.nextInt();
			
		 switch(choice){
		 case 1:
			s.total_marks();
			break;
		 case 2:
			 s.avgPercentage();
			 break;
		 case 3:
			 s.grade();
			 break;
		 case 4:
			 s.displayResult();
			 break;
		 case 5:
			 System.out.println("Exiting  the program ");
			 break;
		default:
			System.out.println("plz Enter the valid choice");
			
		 }
		 }while( choice != 5 );
		
		
}
}
