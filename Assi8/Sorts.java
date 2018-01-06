import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Assignment #: 8
//         Name:
//    StudentID:
//      Lecture:
//  Description: Sorts Objects in an array. (This class will never be instantiated)

public class Sorts {

	public static void sort(Flight[] flightList, int size, Comparator<Flight> comparator) {
		int forLoopIterations = 0;
		int cachIterations = 0;
		int whileLoopIteration = 0;

		for(int i=1;i<size;i++) {
			Flight secondFlight2 = flightList[i];
			int firstFlightIndex = i-1;
			int secondFlightIndex = i;

			try {
					while( (firstFlightIndex >= 0) && (comparator.compare(flightList[firstFlightIndex], flightList[secondFlightIndex]) == 1) ) {
						secondFlight2 = flightList[secondFlightIndex];
						flightList[secondFlightIndex] = flightList[firstFlightIndex];
						firstFlightIndex--;
						secondFlightIndex--;
						whileLoopIteration++;
						int whileLoopSubIteration = 0;
						whileLoopSubIteration++;
						flightList[firstFlightIndex+1] = secondFlight2;
					}

			} catch(ArrayIndexOutOfBoundsException aioob ) {
				flightList[firstFlightIndex+1] = secondFlight2;
				cachIterations++;
			}
			forLoopIterations++;
		}
		
	}
		
}