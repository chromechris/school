// Assignment #: 1
// Arizona State University - CSE205
//         Name: Christopher Angulo 
//    StudentID: cjangulo 1209468608
//      Lecture: MWF 8:35AM-9:25AM
//  Description: This class reads an integer from a keyboard and prints it out 
//               along with other messages.

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory
 
public class Assignment1 
 {
  public static void main (String[] args) 
   {
     int number;
   
     Scanner console = new Scanner(System.in);

     number = console.nextInt();     // read an integer entered by a user
      
    // display the number with other messages
    System.out.print("This program reads an integer from a keyboard,\n"
                   + "and prints it out on the display screen.\n" 
                   + "Make sure that you get the exact same output as the expected one.\n"
                   + "The read number is " + number + ".");
   }
 }

