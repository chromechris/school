// Assignment #: 8
//         Name:
//    StudentID:
//      Lecture:
//  Description:

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FlightManagement implements Serializable {
	private Flight[] flightList;
	private int currentFlightsCount;
	private int maxSize;
	private Comparator<Flight> flightNumberComparator;
	private Comparator<Flight> departureComparator;
	
	public FlightManagement(int maximumsize) {
		this.maxSize = maximumsize;
		this.flightList = new Flight[this.maxSize];
		currentFlightsCount = 0;
	}

	public int flightNumberExists(String airlines, int flightNumber) {
		int flightFound = -1;
		for(int i=0;i<flightList.length;i++) {
			if(flightList[i] == null) {
					flightFound = -1;
			} else {
				Flight currentFlight = flightList[i];
				if(currentFlight.getAirlines().equalsIgnoreCase(airlines) &&  currentFlight.getFlightNum() == flightNumber) {
					return i;
				} else {
					flightFound = -1;
				}
			}
		}
		
		if(flightFound == -1) {
			return -1;
		}
		
		return -1;
	}

	public int departureExists(String city, int year, int month, int date, String time) {
		for(int i=0;i<flightList.length;i++) {
			if(flightList[i] == null) {
				return -1;
			} else {
				if( flightList[i].getDeparture().getCity().equalsIgnoreCase(city) && flightList[i].getDeparture().getYear()==year && flightList[i].getDeparture().getMonth()==month && flightList[i].getDeparture().getDate()==date && flightList[i].getDeparture().getTime().equalsIgnoreCase(time) ) {
					return i;
				}
			}
		}
		return -1;
	}

	public boolean addFlight(String airlines, int flightNum, String depCity, int depYear, int depMonth, int depDate, String depTime, String arrCity,int arrYear, int arrMonth, int arrDate, String arrTime) {
		for(int i=0;i<flightList.length;i++) {
			if(flightList[i] == null) {
				flightList[i] = new Flight();
				flightList[i].setAirlines(airlines);
				flightList[i].setFlightNum(flightNum);
				flightList[i].setDeparture(depCity, depYear, depMonth, depDate, depTime);
				flightList[i].setArrival(arrCity, arrYear, arrMonth, arrDate, arrTime);
				currentFlightsCount++;
				return true;
			} else if(flightList[i] != null) {
					if( flightList[i].getAirlines().equalsIgnoreCase(airlines) && flightList[i].getFlightNum()==flightNum && flightList[i].getDeparture().getCity().equalsIgnoreCase(depCity) && flightList[i].getDeparture().getYear()==depYear && flightList[i].getDeparture().getMonth()==depMonth && flightList[i].getDeparture().getDate()==depDate && flightList[i].getDeparture().getTime().equalsIgnoreCase(depTime) ) {
						return false;
					} else  {
						continue;
					}
			}
		}
		return false;
	}
	
	public boolean removeFlightNumber(String airlines, int flightNumber) {
		boolean deletionFlag = false;

		for(int i=0;i<currentFlightsCount;i++) {
			if( airlines.equalsIgnoreCase(flightList[i].getAirlines()) && flightNumber==flightList[i].getFlightNum() ) {
				List<Flight> mediatorArray = new ArrayList<Flight>(Arrays.asList(flightList));
				mediatorArray.remove(i);
				flightList = mediatorArray.toArray(new Flight[0]);
				deletionFlag = true;
				currentFlightsCount--;
				break;
			} else if( !airlines.equalsIgnoreCase(flightList[i].getAirlines()) && flightNumber!=flightList[i].getFlightNum() ) {
				deletionFlag =  false;
				continue;
			}
			i++;
		}
		if(deletionFlag==true) {
			return deletionFlag;
		}
		return deletionFlag;
	}
	
	public void sortByFlightNumber() {
		flightNumberComparator = new FlightNumberComparator();
		Sorts.sort(flightList, currentFlightsCount, flightNumberComparator);
	}

	public void sortByDeparture() {
		departureComparator = new DepartureComparator();
		Sorts.sort(flightList, currentFlightsCount, departureComparator);
	}

	public String listFlights() {
		boolean helperFlag = false;
		String flightsConcat = "\n";

		for(int i=0;i<currentFlightsCount;i++) {
				flightsConcat = flightsConcat + flightList[i];
				helperFlag = true;
		}
		flightsConcat = flightsConcat + "\n";
			if(helperFlag == true) {
				return flightsConcat;
			}
		return "\nno flight\n\n";
	}

	public void closeFlightManagement() {
		for(int i=0;i<flightList.length;i++) {
			flightList[i] = null;
		}
		currentFlightsCount = 0;
	}
	
}