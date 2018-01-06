// Assignment #: 8
//         Name:
//    StudentID:
//      Lecture:
//  Description: The Assignment 8 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered. 

import java.io.*;

public class Assignment8
 {
  public static void main (String[] args)
   {
     char input1;
     String airlines, depCity, depTime, arrCity, arrTime;
     String flightNumStr, depYearStr, depMonthStr, depDateStr, arrYearStr, arrMonthStr, arrDateStr;;
     int flightNum, depYear, depMonth, depDate, arrYear, arrMonth, arrDate;
     boolean operation = false;
     int operation2 = 0;
     String line;
     String filename;

     FlightManagement manage1 = null;

     try
      {
       printMenu();

       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       System.out.print("Please enter a maximum number of flights\n");
       String maxStr = stdin.readLine().trim();
       
       int max = Integer.parseInt(maxStr);
       manage1 = new FlightManagement(max);

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
                 System.out.print("Please enter a flight to add:\n");
                 System.out.print("Please enter its airlines to add:\n");
                 airlines = stdin.readLine().trim();
                 System.out.print("Please enter its flight number to add:\n");
                 flightNumStr = stdin.readLine().trim();
                 flightNum = Integer.parseInt(flightNumStr);
                    
                 System.out.print("Please enter its departure city to add:\n");
                 depCity = stdin.readLine().trim();
                 System.out.print("Please enter its departure year to add:\n");
                 depYearStr = stdin.readLine().trim();
                 depYear = Integer.parseInt(depYearStr);
                 System.out.print("Please enter its departure month to add:\n");
                 depMonthStr = stdin.readLine().trim();
                 depMonth = Integer.parseInt(depMonthStr);
                 System.out.print("Please enter its departure date to add:\n");
                 depDateStr = stdin.readLine().trim();
                 depDate = Integer.parseInt(depDateStr);
                 System.out.print("Please enter its departure time to add:\n");
                 depTime = stdin.readLine().trim();

                 System.out.print("Please enter its arrival city to add:\n");
                 arrCity = stdin.readLine().trim();
                 System.out.print("Please enter its arrival year to add:\n");
                 arrYearStr = stdin.readLine().trim();
                 arrYear = Integer.parseInt(arrYearStr);
                 System.out.print("Please enter its arrival month to add:\n");
                 arrMonthStr = stdin.readLine().trim();
                 arrMonth = Integer.parseInt(arrMonthStr);
                 System.out.print("Please enter its arrival date to add:\n");
                 arrDateStr = stdin.readLine().trim();
                 arrDate = Integer.parseInt(arrDateStr);
                 System.out.print("Please enter its arrival time to add:\n");
                 arrTime = stdin.readLine().trim();

                 operation = manage1.addFlight(airlines, flightNum, depCity, depYear, depMonth, depDate,
                                                depTime, arrCity, arrYear, arrMonth, arrDate, arrTime);
                 if (operation == true)
                  System.out.print("flight added\n");
                 else
                  System.out.print("flight not added\n");
                 break;
             case 'C':
                 System.out.print("Please enter a new maximum number of flights:\n");
                 maxStr = stdin.readLine().trim();

                 max = Integer.parseInt(maxStr);
                 manage1 = new FlightManagement(max);
                 break;
             case 'D':
                 System.out.print("Please enter Airlines to search:\n");
                 airlines = stdin.readLine().trim();
                 System.out.print("Please enter flight number to search:\n");
                 flightNumStr = stdin.readLine().trim();
                 flightNum = Integer.parseInt(flightNumStr);
                 operation2=manage1.flightNumberExists(airlines, flightNum);

                 if (operation2 > -1)
                   System.out.print("flight number " + airlines + flightNum + " found\n");
                 else
                   System.out.print("flight number " + airlines + flightNum + " not found\n");
                 break;
             case 'E':
                 System.out.print("Please enter departure city to search:\n");
                 depCity = stdin.readLine().trim();
                 System.out.print("Please enter its departure year to search:\n");
                 depYearStr = stdin.readLine().trim();
                 depYear = Integer.parseInt(depYearStr);
                 System.out.print("Please enter its departure month to search:\n");
                 depMonthStr = stdin.readLine().trim();
                 depMonth = Integer.parseInt(depMonthStr);
                 System.out.print("Please enter its departure date to search:\n");
                 depDateStr = stdin.readLine().trim();
                 depDate = Integer.parseInt(depDateStr);
                 System.out.print("Please enter its departure time to search:\n");
                 depTime = stdin.readLine().trim();
                 operation2=manage1.departureExists(depCity, depYear, depMonth, depDate, depTime);
                    
                 if (operation2 > -1)
                  {
                        System.out.print("flight departure "  + depCity + "," + depMonth
                                         + "-" + depDate + "-" + depYear +"," + depTime + " found\n");
                  }
                 else
                  {
                        System.out.print("flight departure "  + depCity + "," + depMonth
                                         + "-" + depDate + "-" + depYear +"," + depTime + " not found\n");
                  }
                 break;
             case 'L':
                 System.out.print(manage1.listFlights());
                 break;
             case 'O':
                 manage1.sortByFlightNumber();
                 System.out.print("sorted by flight numbers\n");
                 break;
             case 'P':
                 manage1.sortByDeparture();
                 System.out.print("sorted by departures\n");
               break;
             case 'Q':
                 break;
             case 'R':
                System.out.print("Please enter Airlines to remove:\n");
                airlines = stdin.readLine().trim();
                System.out.print("Please enter flight number to remove:\n");
                flightNumStr = stdin.readLine().trim();
                flightNum = Integer.parseInt(flightNumStr);
                operation=manage1.removeFlightNumber(airlines, flightNum);
                if (operation == true)
                   System.out.print("flight number " + airlines + flightNum + " removed\n");
                else
                   System.out.print("flight number " + airlines + flightNum + " not found\n");
               break;
             case 'T':
                 manage1.closeFlightManagement();
                 System.out.print("flight management system closed\n");
                 break;
             case 'U':
                 System.out.print("Please enter a file name to write:\n");
                 filename = stdin.readLine().trim();
                 System.out.println("Please enter a string to write in the file:");
                 String userInput = stdin.readLine().trim() + "\n";

                 FileWriter fw = null;
                 BufferedWriter bw = null;		 
                 
                 try {
                	fw = new FileWriter(filename);
                	bw = new BufferedWriter(fw);
                	bw.write(userInput);
                	System.out.println(filename + " was written");
                 } catch(IOException ioe) {

                 } finally {
                	 bw.close();
                	 fw.close();
                 }
                 break;
             case 'V':
                 System.out.print("Please enter a file name to read:\n");
                 filename = stdin.readLine().trim();
                 
                 File file = null;
                 FileReader fr = null;
                 BufferedReader br = null;
                 String fileInputFirstLine = null;
                 
                 try {
                	file = new File(filename);
                	fr = new FileReader(file);
                	br = new BufferedReader(fr);

                	fileInputFirstLine = br.readLine();
                	System.out.println(filename + " was read\n" + "The first line of the file is:\n" + fileInputFirstLine);
                	br.close();
                	fr.close();
                 } catch(FileNotFoundException ioe) {
                	 System.out.println(filename + " was not found");
                 } catch(IOException ioe) {

                 }  finally {

                 }
                 break;
             case 'W':
                 System.out.print("Please enter a file name to write:\n");
                 filename = stdin.readLine().trim();
                 try {
                	 FileOutputStream fos = new FileOutputStream(filename);
                	 ObjectOutputStream oos = new ObjectOutputStream(fos);
                	 oos.writeObject(manage1);
                	 System.out.println(filename + " was written");
                 } catch(IOException ioe) {

                 }
                 break;
             case 'X':
                 System.out.print("Please enter a file name to read:\n");
                 filename = stdin.readLine().trim();
                 try {
                	 FileInputStream fis = new FileInputStream(filename);
                	 ObjectInputStream ois = new ObjectInputStream(fis);
                	 manage1 = (FlightManagement) ois.readObject();
                	 System.out.println(filename + " was read");
                 } catch(ClassNotFoundException cnfe) {

                 } catch(FileNotFoundException fnfe) {
                	 System.out.println(filename + " was not found");
                 }catch(IOException ioe) {

                 }
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
                        "A\t\tAdd Flight\n" +
                        "C\t\tCreate FlightManagement\n" +
                        "D\t\tSearch by Flight Number\n" +
                        "E\t\tSearch by Departure\n" +
                        "L\t\tList Flights\n" +
                        "O\t\tSort by Flight Number\n" +
                        "P\t\tSort by Departure\n" +
                        "Q\t\tQuit\n" +
                        "R\t\tRemove by Flight Number\n" +
                        "T\t\tClose FlightManagement\n" +
                        "U\t\tWrite Text to File\n" +
                        "V\t\tRead Text from File\n" +
                        "W\t\tSerialize FlightManagement to File\n" +
                        "X\t\tDeserialize FlightManagement from File\n" +
                        "?\t\tDisplay Help\n\n");
  }
}