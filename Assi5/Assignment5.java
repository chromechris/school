// Assignment #: 5
// Arizona State University - CSE205
//         Name:
//    StudentID:
//      Lecture:
//  Description: The Assignment 5 class displays a menu of choices
//               (add cylinder soup, box soup,search soup,
//               list soups, quit, display menu) to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;
import java.util.*;

public class Assignment5
 {
  public static void main (String[] args)
   {  
     char input1;
     String inputInfo = new String();
     String line = new String();
     boolean operation;
     Soup cylinderOrBox = null;
     List<Soup> soups = new ArrayList<Soup>();

     ArrayList soupList = new ArrayList();

     try
      {
       printMenu();

       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':
               System.out.print("Please enter some soup information to add:\n");
               inputInfo = stdin.readLine().trim();
               cylinderOrBox = SoupParser.parseStringToSoup(inputInfo);
               soups.add(cylinderOrBox);
               break;
             case 'C':
               for(int i=0;i<soups.size();i++) {
          		 soups.get(i).computeTotalPrice();
          	 	}
               System.out.print("total prices computed\n");
               break;
             case 'D':
               System.out.print("Please enter a soupID to search:\n");
               inputInfo = stdin.readLine().trim();
               operation = false;

               for(int i=0;i<soups.size();i++) {
            	   soups.get(i).getSoupId();
            	   if(soups.get(i).getSoupId().contains(inputInfo)) {
            		   operation = true;
            		   break;
            	   } else {
            		   operation = false;
            	   }
               }
               
                if (operation == true)
                 System.out.print("soup found\n");
                else
                 System.out.print("soup not found\n");
               break;
             case 'L':

            	 for(int i=0;i<soups.size();i++) {
            		 System.out.println(soups.get(i).toString());
            	 }

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
        } while (input1 != 'Q');
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Soup\n" +
                      "C\t\tCompute Total Prices\n" +
                      "D\t\tSearch for Soup\n" +
                      "L\t\tList Soups\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}