import java.io.Serializable;

// Assignment #: 8
//         Name:
//    StudentID:
//      Lecture:
//  Description: The Schedule class descrives a departure or an arrival
//               information of a flight including a city, time, and date.
//               It also provides their accessor, mutator methods,
//               and toString method.


public class Schedule implements Serializable
{ 
 private String city;
 private int year;
 private int month;
 private int date;
 private String time;

 public Schedule()
  {
   city = new String("?");
   time= new String("?");
   year = 0;
   month = 0;
   date = 0;
  }

 public String getCity()
  {
   return city;
  }

 public String getTime()
  {
   return time;
  }

 public int getYear()
  {
   return year;
  }

 public int getMonth()
  {
   return month;
  }

 public int getDate()
  {
   return date;
  }

 public void setCity(String place)
  {
   city = place;
  }

 public void setTime(String someTime)
  {
   time = someTime;
  }

 public void setDate(int someDate)
  {
   date = someDate;
  }

 public void setYear(int someYear)
  {
   year = someYear;
  }

 public void setMonth(int someMonth)
  {
   month = someMonth;
  }

 public void copy(Schedule other)
  {
	   this.city = other.city;
	   this.time= other.time;
	   this.year = other.year;
	   this.month = other.month;
	   this.date = other.date;
  }

 public String toString()
  {
   String result;

   result = city + "," + month + "-" + date + "-" + year + "," + time;

   return result;
  }

}