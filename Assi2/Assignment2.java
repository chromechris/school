// Assignment #: 2
// Student Name: 
// Student ID: 
// Lecture Number: 

import java.util.Scanner;

public class Assignment2 {

 public static void main(String[] args) {
	 
	 int minInt=0;
	 int intAmount=0;
	 int positiveIntSum=0; 
	 int evenIntAmount=0;
	 int tempInt;
		
	 Scanner input = new Scanner(System.in);

	 tempInt = input.nextInt();
	 
	 while (tempInt != 0) {
		 intAmount++;
		 if (tempInt > 0) {
			 positiveIntSum=positiveIntSum+tempInt;
		 }
		 if (tempInt%2 == 0) {
			 evenIntAmount++;
		 }
		 if (tempInt < minInt) {
			 minInt=tempInt;
		 }
		 tempInt=input.nextInt();
	 }
	 intAmount=intAmount+1;
	 evenIntAmount=evenIntAmount+1;
	 System.out.println("The minimum integer is " + minInt);
	 System.out.println("The count of integers is " + intAmount);
	 System.out.println("The sum of positive integers is " + positiveIntSum);
	 System.out.print("The count of even integers in the sequence is " + evenIntAmount);
 }
}