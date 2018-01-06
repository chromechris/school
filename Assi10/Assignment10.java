// Assignment #: 10
//         Name:
//    StudentID:
//  Lab Lecture:
//  Description: The Assignment 10 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;

public class Assignment10
{
   public static void main(String[] args)
   {
      char input1;
       String inputInfo = new String();
       int operation2;
       String line = new String();

       LinkedList list1 = new LinkedList();

       try
        {
         printMenu();

         InputStreamReader isr = new InputStreamReader (System.in);
         BufferedReader stdin = new BufferedReader (isr);

         do
          {
           System.out.print("What action would you like to perform?\n");
           line = stdin.readLine().trim();
           input1 = line.charAt(0);
           input1 = Character.toUpperCase(input1);

           if (line.length() == 1)
            {
             switch (input1)
              {
               case 'A':
                 System.out.print("Please enter a string to add:\n");
                 String str1 = stdin.readLine().trim();
                 System.out.print("Please enter its index:\n");
                 int index = Integer.parseInt(stdin.readLine().trim());
                 try
                  {
                    list1.addElement(str1, index);
                  }
                 catch(IndexOutOfBoundsException ex)
                  {
                      System.out.print("The index is out of bounds\n");
                  }
                 break;
               case 'C':
                 int size = list1.size();
                 System.out.print("The size of the linked list is " + size + "\n");
                 break;
               case 'D':
                 String smallest = list1.findSmallest();
                 if (smallest != null)
                     System.out.print("The smallest string is " + smallest + "\n");
                 else
                     System.out.print("There is no element in the linked list\n");
                 break;
               case 'L':
                 System.out.print(list1.toString());
                 break;
               case 'Q':
                 break;
               case 'R':
                 System.out.print("Please enter a string to replace from the linked list:\n");
                 String first = stdin.readLine().trim();
                 System.out.print("Please enter a string to replace with:\n");
                 String second = stdin.readLine().trim();
                 list1.searchAndReplace(first, second);
                 break;
               case 'S':
                 System.out.print("Please enter a string to remove from the linked list:\n");
                 inputInfo = stdin.readLine().trim();
                 list1.searchAndRemove(inputInfo);
                 break;
               case 'T':
                 System.out.print("Please enter a number of elements to reverse from the beginning:\n");
                 inputInfo = stdin.readLine().trim();
                 int howMany = Integer.parseInt(inputInfo);
                 list1.reverseFirstSome(howMany);
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
       catch (IOException exception)
        {
          System.out.print("IO Exception\n");
        }
    }

    public static void printMenu()
     {
       System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd String\n" +
                        "C\t\tCount its Size\n" +
                        "D\t\tFind Smallest\n" +
                        "L\t\tList Strings\n" +
                        "Q\t\tQuit\n" +
                        "R\t\tReplace Strings\n" +
                        "S\t\tRemove Strings\n" +
                        "T\t\tReverse Strings from Beginning\n" +
                        "?\t\tDisplay Help\n\n");
    }
}