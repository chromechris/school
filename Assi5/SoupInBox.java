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

public class SoupInBox extends Soup {

	private int height;
	private int width;
	private int depth;
	
	public SoupInBox(String id, double someUnitPrice, int someHeight, int someWidth, int someDepth) {
		super(id, someUnitPrice);
		height = someHeight;
		width = someWidth;
		depth = someDepth;
	}
	
	public void computeTotalPrice() {
		volume = (height * width * depth);
		totalPrice = (volume * unitPrice);
	}
	
	public String toString() {
		return "\nThe Soup in a Box Container\n" +
		"The Height:\t\t" + height + "\n" +
		"The Width:\t\t" + width + "\n" +
		"The Depth:\t\t" + depth + super.toString();
	}
	
}