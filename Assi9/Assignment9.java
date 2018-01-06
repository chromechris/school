// Assignment #: 9
//         Name:
//    StudentID:
//      Lecture:
//  Description: Uses recursive methods in order to find the smallest, largest from the first index, sum of all 
//numbers from all even indeces, & numbers divisible by three from an int array. Also, static variables & loops cannot 
//cannot be used in the recursive methods.
//This program assumes that there will not be more than 100 numbers.
//This program assumes that a user will enter at least one number before 0 is entered, thus at least two numbers will 
//be entered including 0.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Assignment9 {
	private int[] intArray;
	private int minimumNumber;
	private int sumAtEvenIndexes;
	private int divisibleByThree;
	private int maxNumLessThanFirst;
	private int startIndex;
	private int endIndex;
	private int firstNumber;

	private int index;
	private int minimum;
	private int myEndIndex;

	public static void main(String[] args) {
		Assignment9 app = new Assignment9();
		app.userInput();

		app.setMinimumNumber(findMin(app.getArray(),app.getIndex(),app.getMinimum()));
		System.out.println("The minimum number is " + app.getMinimumNumber());
		
		app.setSumAtEvenIndexes(computeSumAtEvenIndexes(app.getArray(),app.getStartIndex(),app.getMyEndIndex()));
		System.out.println("The sum of numbers at even indexes is " + app.getSumAtEvenIndexes());
		
		app.setDivisibleByThree(countDivisibleBy3(app.getArray(),app.getStartIndex(),app.getMyEndIndex()));
		System.out.println("The count of numbers that are divisible by 3 is " + app.getDivisibleByThree());
		
		app.setMaxNumLessThanFirst(findMaxOfLessThanFirst(app.getArray(),app.getStartIndex(),app.getMyEndIndex(),app.getFirstNumber()));
		System.out.println("The maximum number among numbers that are less than the first number is " + app.getMaxNumLessThanFirst());
	}

	public void userInput() {
	    InputStreamReader isr = new InputStreamReader (System.in);
	    BufferedReader bf = new BufferedReader (isr);
	    try {
	    	int userInputInt;
	    	List<Integer> tempIntArrayList = new ArrayList<Integer>();
	    	do {
	    		String userInput = bf.readLine();
	    		userInputInt = Integer.parseInt(userInput);
	    		tempIntArrayList.add(userInputInt);
	    	} while(userInputInt!=0);
			
	    	intArray = new int[tempIntArrayList.size()];
	    	for(int i=0;i<intArray.length;i++) {
    			intArray[i] = tempIntArrayList.get(i);
    		}
	    	startIndex = 0;
	    	endIndex = intArray.length-1;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
	}

	public static int findMin(int[] numbers, int index, int min) {
		if(index==numbers.length-1) {
			return min;
		}
		if(numbers[index] < min) {
			min = numbers[index];
		}
		return findMin(numbers,index+1,min);
	}

	public static int computeSumAtEvenIndexes(int[] numbers, int startIndex, int endIndex) {
		if(startIndex==numbers.length) {
			return endIndex;
		}
		if(startIndex%2==0) {
			endIndex = endIndex + numbers[startIndex];
		}
		return computeSumAtEvenIndexes(numbers,startIndex+1,endIndex);
	}

	public static int countDivisibleBy3(int[] numbers, int startIndex, int endIndex) {
		if(startIndex == numbers.length) {
			return endIndex;
		}
		if(numbers[startIndex]%3 == 0) {
			endIndex = endIndex+1;
		}
		return countDivisibleBy3(numbers,startIndex+1,endIndex);
	}

	public static int findMaxOfLessThanFirst(int[] numbers, int startIndex, int endIndex, int firstNumber) {
		final int myFirstNumber = numbers[0];
		if(startIndex == numbers.length) {
			return firstNumber;
		}

		if(numbers[startIndex] < myFirstNumber ) {
			endIndex = numbers[startIndex];
			if(firstNumber==0) {
				firstNumber = endIndex;
			}
		}
		if(endIndex > firstNumber) {
			firstNumber = endIndex;
		}
		return findMaxOfLessThanFirst(numbers,startIndex+1,endIndex,firstNumber);
	}

	public int[] getArray() {
		return intArray;
	}
	
	public int getStartIndex() {
		return startIndex;
	}
	
	public int getEndIndex() {
		return endIndex;
	}
	
	public int getMinimumNumber() {
		return minimumNumber;
	}
	
	public void setMinimumNumber(int minimumNumber) {
		this.minimumNumber = minimumNumber;
	}
	
	public int getSumAtEvenIndexes() {
		return sumAtEvenIndexes;
	}
	
	public void setSumAtEvenIndexes(int sumAtEvenIndexes) {
		this.sumAtEvenIndexes = sumAtEvenIndexes;
	}
	
	public int getDivisibleByThree() {
		return divisibleByThree;
	}
	
	public void setDivisibleByThree(int divisibleByThree) {
		this.divisibleByThree = divisibleByThree;
	}
	
	public int getMaxNumLessThanFirst() {
		return maxNumLessThanFirst;
	}
	
	public void setMaxNumLessThanFirst(int maxNumLessThanFirst) {
		this.maxNumLessThanFirst = maxNumLessThanFirst;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getMinimum() {
		return minimum;
	}
	
	public int getMyEndIndex() {
		return myEndIndex;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}

}