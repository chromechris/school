import java.util.Comparator;

// Assignment #: 8
//         Name: Christopher Angulo
//    StudentID: 1209468608
//      Lecture: CSE-205 Monday,Wednesday,Friday 8:30AM-9:20AM
//  Description: Compares the lexicographic & numeric values of a Flight Object based on the Flight Object's airline & flight number and returns 
               //a numeric value accordingly

public class FlightNumberComparator implements Comparator<Flight> { //Finished

//	private Flight[] flightList;
//	
//	public FlightNumberComparator(Flight[] flightList) {
//		this.flightList = flightList;
//	}
	
	@Override
	public int compare(Flight first, Flight second) { //Finished
		if(first.getAirlines().compareTo(second.getAirlines())<0) {
			return -1;
		} else if(first.getAirlines().compareTo(second.getAirlines())>0) {
			return 1;
		} else if(first.getAirlines().compareTo(second.getAirlines())==0) {
			if(first.getFlightNum() < second.getFlightNum()) {
				return -1;
			} else if(first.getFlightNum() > second.getFlightNum()) {
				return 1;
			} else if(first.getFlightNum() == second.getFlightNum()) {
				return 0;
			}
		}
		return 0;
	}
	
}
