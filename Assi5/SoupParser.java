// Assignment #: 5
// Arizona State University - CSE205
//         Name:
//    StudentID:
//      Lecture:
//  Description: The Assignment 5 class displays a menu of choices
//               (add cylinder soup, box soup,search soup,
//               list soups, quit, display menu) to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

public class SoupParser {

	public static Soup parseStringToSoup(String lineToParse) {
		String myCylSoupId= null;
		double myCylSomeUnitPrice= 0.0;
		int mySomeCylRadius = 0;
		int mySomeCylHeight = 0;

		String myBoxSoupId= null;
		double myBoxSomeUnitPrice= 0.0;
		int mySomeBoxHeight = 0;
		int mySomeBoxWidth = 0;
		int mySomeBoxDepth = 0;
		
		String[] inputArray;
		
		inputArray = lineToParse.split("/");
		
		if(inputArray[0].equalsIgnoreCase("cylinder")) {
			myCylSoupId = inputArray[1];
			myCylSomeUnitPrice = Double.parseDouble(inputArray[2]);
			mySomeCylRadius = Integer.parseInt(inputArray[3]);
			mySomeCylHeight = Integer.parseInt(inputArray[4]);
			SoupInCylinder cylinder = new SoupInCylinder(myCylSoupId, myCylSomeUnitPrice, mySomeCylRadius, mySomeCylHeight);
			return cylinder;
		} else {
			myBoxSoupId = inputArray[1];
			myBoxSomeUnitPrice = Double.parseDouble(inputArray[2]);
			mySomeBoxHeight = Integer.parseInt(inputArray[3]);
			mySomeBoxWidth = Integer.parseInt(inputArray[4]);
			mySomeBoxDepth = Integer.parseInt(inputArray[5]);
			SoupInBox box = new SoupInBox(myBoxSoupId, myBoxSomeUnitPrice, mySomeBoxHeight, mySomeBoxWidth, mySomeBoxDepth);
			return box;
		}
	}

}