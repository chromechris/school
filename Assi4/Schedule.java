// Assignment #: 4
// Student Name:
// Student ID:
// Lecture Number:

public class Schedule {

	private String city;
	private String date;
	private String time;
	
	
	public Schedule() {
		city = "?";
		date = "?";
		time = "?";
	}


	public String getCity() { //"city" variable accessor method
		return city;
	}


	public void setCity(String city) { //"city" variable mutator method
		this.city = city;
	}


	public String getDate() { //"date" variable accessor method
		return date;
	}


	public void setDate(String date) { //"date" variable mutator method
		this.date = date;
	}


	public String getTime() { //"time" variable accessor method
		return time;
	}


	public void setTime(String time) { //"time" variable mutator method
		this.time = time;
	}
	
	public String toString() { //Override toString method. When "Schedule" class is printed out, the content of this method will be printed
		return city + "," + date + "," + time;
	}
	
}