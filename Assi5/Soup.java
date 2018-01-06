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

import java.text.*;
import java.util.Locale;

public abstract class Soup {

	protected int volume;
	protected double unitPrice;
	protected double totalPrice;
	protected String soupId;
	NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
	DecimalFormat dc = new DecimalFormat("0.0000");
	
	
	public Soup(String id, double someUnitPrice) {
		volume = 0;
		totalPrice = 0.0;
		soupId = id;
		unitPrice = someUnitPrice;
	}
	
	public String getSoupId() {
		return soupId;
	}
	
	public abstract void computeTotalPrice();
	
	public String toString() {
		return "\nThe SoupId:\t\t" + soupId + "\n" +
				"The Volume:\t\t" + volume + "\n" +
				"The Unit Price:\t\t" + dc.format(unitPrice) + "\n" + 
				"The Total Price:\t" +  nf.format(totalPrice) + "\n";
	}
	
}