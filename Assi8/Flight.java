import java.io.Serializable;

// Assignment #: 8
//         Name:
//    StudentID:
//      Lecture:
//  Description: The Flight class describes attributes in a flight
//               and provides accessor and mutator methods for each
//               instance variables as well as toString method.


public class Flight implements Serializable
 {
  private String airlines;
  private int flightNum;
  private Schedule departure;
  private Schedule arrival;

  public Flight()
   {
    airlines = new String("?");
    flightNum = 0;
    departure = new Schedule();
    arrival = new Schedule();
   }

  public String getAirlines()
   {
    return airlines;
   }

  public int getFlightNum()
   {
    return flightNum;
   }

  public Schedule getDeparture()
   {
    return departure;
   }

  public Schedule getArrival()
   {
    return arrival;
   }

  public void setAirlines(String airlinesName )
   {
    airlines = airlinesName;
   }

  public void setFlightNum(int fNumber)
   {
    flightNum = fNumber;
   }

  public void setDeparture(String someCity, int someYear, int someMonth, int someDate, String someTime)
   {
    departure.setCity(someCity);
    departure.setYear(someYear);
    departure.setMonth(someMonth);
    departure.setDate(someDate);
    departure.setTime(someTime);
   }

  public void setArrival(String someCity, int someYear, int someMonth, int someDate, String someTime)
   {
    arrival.setCity(someCity);
    arrival.setYear(someYear);
    arrival.setMonth(someMonth);
    arrival.setDate(someDate);
    arrival.setTime(someTime);
   }

  public void copy(Flight other)
   {
	    airlines = other.airlines;
	    flightNum = other.flightNum;
	    departure = other.departure;
	    arrival = other.arrival;
   }

  public String toString()
   {
    String result = "\nAirlines:\t" + airlines + "\n" +
            "Number:\t\t" + flightNum + "\n" +
            "Departure:\t" + departure.toString() + "\n" +
            "Arrival:\t" + arrival.toString() + "\n";

    result += "\n";

    return result;
   }

}