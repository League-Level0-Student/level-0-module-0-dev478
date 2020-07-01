package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	public static void main(String[] args) {
	// 1. Make a main method that includes everything below
		Random generator = new Random();    //This will be used below to make a random number. 
	
		System.out.println();


		// 2. Make a variable that will hold a random whole number
	int variable = generator.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// . Print your variable to the console
	System.out.println(variable);
		// 4. Get the user to enter something that they think is awesome
	String ans = JOptionPane.showInputDialog("Enter an item that you think is awesome.");
		// 5. If your variable is  0
	
	if(ans.contentEquals("")) {
		JOptionPane.showMessageDialog(null, "HOw DArE YoU Not ENTer ANYTHIng!!!!!!");
	}
	
	if(ans.charAt(0)<64) {
		JOptionPane.showMessageDialog(null, "DO NoT ansWER A NuMBer!!!!!");
		
		
	}
	if(variable==0) {
		JOptionPane.showMessageDialog(null, ans + " is awesome!");
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if(variable==1) {
		JOptionPane.showMessageDialog(null, ans + " is ok.");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if(variable==2) {
			
		JOptionPane.showMessageDialog(null, ans + " is boring.");
	}
			// -- tell the user whatever they entered is boring.
	
		
			//sorry
	//I will help
		
if(variable==3) {
	JOptionPane.showMessageDialog(null, ans + "is horrible.");
	
}
			// -- tell the user whatever they entered is horrible.

}
}

