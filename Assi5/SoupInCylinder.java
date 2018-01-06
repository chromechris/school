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

public class SoupInCylinder extends Soup {

	private int radius;
	private int height;
	
	public SoupInCylinder(String id, double someUnitPrice, int someRadius, int someHeight) {
		super(id, someUnitPrice);
		radius = someRadius;
		height = someHeight;
	}

	public void computeTotalPrice() {
		volume = (int)((radius * radius * height) * Math.PI);
		totalPrice = (volume * unitPrice);
	}
	
	public String toString() {
		return "\nThe Soup in a Cylinder Container\n" +
				"The Radius:\t\t" + radius + "\n" +
				"The Height:\t\t" + height + super.toString();
		
	}

}