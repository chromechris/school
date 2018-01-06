// Assignment #: 4
// Student Name:
// Student ID:
// Lecture Number:

public class Flight {
	private String airlines;
	private int flightNum;
	private Schedule schedule1;
	private Schedule schedule2;
	
    public Flight() {
    	airlines = "?";
    	flightNum = 0;
    	schedule1 = new Schedule();
    	schedule2 = new Schedule();
    }

	public String getAirlines() { //"airlines" variable accessor method
		return airlines;
	}

	public void setAirlines(String airlines) { //"airlines" variable mutator method
		this.airlines = airlines;
	}

	public int getFlightNum() { //"flightNum" variable accessor method
		return flightNum;
	}

	public void setFlightNum(int flightNum) { //"flightNum" variable mutator method
		this.flightNum = flightNum;
	}
    
    public void setDeparture(String city, String date, String time) {
    	 schedule1.setCity(city);
    	 schedule1.setDate(date);
    	 schedule1.setTime(time);
    }
	
    public void setArrival(String city, String date, String time) {
   	 schedule2.setCity(city);
   	 schedule2.setDate(date);
   	 schedule2.setTime(time);
   }
    
    public String toString() {
    	return "\nAirlines:\t" + airlines + "\nNumber:\t\t" + flightNum + 
    			"\nDeparture:\t" + schedule1 + "\nArrival:\t" + schedule2 + "\n\n";
    }
    
}