// Assignment #: 4
// Name: 
// StudentID: 
// Lecture: 
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.

import java.io.*;
import java.util.*;

public class Assignment4
 {
  public static void main (String[] args)
   {
       char input1 = 'Z';
       String inputInfo;
       String airlines, depCity, depTime, depDate, arrCity, arrTime, arrDate;
       int flightNumber;
       String line = new String();

       Flight flight1 = new Flight();

       printMenu();

       Scanner scan = new Scanner(System.in);

       do
        {
         System.out.println("What action would you like to perform?");
         line = scan.next();

         if (line.length() == 1)
          {
           input1 = line.charAt(0);
           input1 = Character.toUpperCase(input1);

           switch (input1)
            {
             case 'A':
               System.out.print("Please enter the flight information:\n");
               System.out.print("Enter its airlines:\n");
               airlines = scan.next();
               flight1.setAirlines(airlines);

               System.out.print("Enter its flight number:\n");
               flightNumber = scan.nextInt();
               flight1.setFlightNum(flightNumber);

               System.out.print("Enter its departure city:\n");
               depCity = scan.next();
               System.out.print("Enter its departure time:\n");
               depTime = scan.next();
               System.out.print("Enter its departure date:\n");
               depDate = scan.next();
               flight1.setDeparture(depCity, depDate, depTime);

               System.out.print("Enter its arrival city:\n");
               arrCity = scan.next();
               System.out.print("Enter its arrival time:\n");
               arrTime = scan.next();
               System.out.print("Enter its arrival date:\n");
               arrDate = scan.next();
               flight1.setArrival(arrCity, arrDate, arrTime);
               break;
             case 'D':
               System.out.print(flight1);
               break;
             case 'Q':
               break;
             case '?':
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
          }
         else
          {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q' || line.length() != 1);
   }

  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Flight\n" +
                        "D\t\tDisplay Flight\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}