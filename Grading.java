package task9prog;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Marks:");
	      int average = sc.nextInt();
	      char grade;

	      if(average>=100){
	         grade = 'S';
	      }else if(average>=90 && average<99){
	         grade = 'A';
	      }
	      else if(average>=80 && average<89){
	         grade = 'B';
	      }
	      else if(average>=70 && average<79){
		         grade = 'C';
		      }
	      else if(average>=60 && average<69){
		         grade = 'D';
		      }
	      
	      else if(average>=50 && average<59){
		         grade = 'E';
		      }
	      else {
		         grade = 'F';
		      }
	      System.out.println("Your grade is " + grade);
	   }
}

