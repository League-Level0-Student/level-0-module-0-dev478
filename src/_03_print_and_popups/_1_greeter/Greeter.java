package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	
	
public static void main(String[] args) {
	//EXAMPLE
	
//	String input = JOptionPane.showInputDialog("What day is today? ");
//	JOptionPane.showMessageDialog(null, "Today is " + input +" and is a beautiful day");
	
	String input =JOptionPane.showInputDialog("Pick a number between 1 and 700.");
	JOptionPane.showMessageDialog(null,"You are sadly mistaken. " + input + " is not the right choice. You're mental capabilities need configuring.");
	
	
	
}

}
