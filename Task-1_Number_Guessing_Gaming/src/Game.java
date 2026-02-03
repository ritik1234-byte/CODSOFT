import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Game {
	public static void main(String args []) {
		try {
		Random obj=new Random();
		Scanner sc=new Scanner(System.in);
		int number=obj.nextInt(100)+1;  // genterate random no 1 to 100
		int i=0;
		while(true) {
			System.out.println("guess the no:");
			int guess=sc.nextInt();
			i++;
		if(guess==number) {
			System.out.println("Congrats you guess the number");
			System.out.println("your Score : " + i);
			break;
		}
		else if(guess>number) {
			System.out.println("too high");
		
		}
		else if(guess<number) {
			System.out.println("too low");
			
		}
		else {
			
		}
		
		}
		
		}
		catch(Exception e) {
			System.out.println("plz enter the valid number(only numerical value value");
		}
		
		}
		
				
			
	}
