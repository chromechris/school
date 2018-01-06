import java.util.Comparator;

// Assignment #: 8
//         Name:
//    StudentID:
//      Lecture:
//  Description:

public class DepartureComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight first, Flight second) {
		if(first.getDeparture().getCity().compareTo(second.getDeparture().getCity()) < 0) {
			return -1;
		} else if(first.getDeparture().getCity().compareTo(second.getDeparture().getCity()) > 0) {
			return 1;
		} else if(first.getDeparture().getCity().compareTo(second.getDeparture().getCity()) == 0) {
			if(first.getDeparture().getYear() < second.getDeparture().getYear()) {
				return -1;
			} else if(first.getDeparture().getYear() > second.getDeparture().getYear()) {
				return 1;
			} else if(first.getDeparture().getYear() == second.getDeparture().getYear()) {
				if(first.getDeparture().getMonth() < second.getDeparture().getMonth()) {
					return -1;
				} else if(first.getDeparture().getMonth() > second.getDeparture().getMonth()) {
					return 1;
				} else if(first.getDeparture().getMonth() == second.getDeparture().getMonth()) {
					if(first.getDeparture().getDate() < second.getDeparture().getDate()) {
						return -1;
					} else if(first.getDeparture().getDate() > second.getDeparture().getDate()) {
						return 1;
					} else if(first.getDeparture().getDate() == second.getDeparture().getDate()) {
						if(first.getDeparture().getTime().compareTo(second.getDeparture().getTime()) < 0) {
							return -1;
						} else if(first.getDeparture().getTime().compareTo(second.getDeparture().getTime()) > 0) {
							return 1;
						} else if(first.getDeparture().getTime().compareTo(second.getDeparture().getTime()) == 0) {
							return 0;
						}
					}
				}
			}
		}
		return 0;
	}
	
}