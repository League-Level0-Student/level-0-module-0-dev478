package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String ans = JOptionPane.showInputDialog(null, "What goes on four legs in the morning, two legs at noon, and three legs in the evening?" );
				System.out.println("Your answer is:" +  ans);
				// 3.  Use an if statement to check if their answer is correct
				if(ans.equalsIgnoreCase("man")) {
					System.out.println("Your answer is correct!");
					score++;
				}
				else {
					System.out.println("Sorry, your answer is incorrect.");
					score--;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		//Print the current score after Q1		
		System.out.println("Current score is: " + score);
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String ans2 = JOptionPane.showInputDialog("First, think of the person that lives in disguise, \n who deals in secrets and tells naught but lies. \n Next, tell me what's always the last thing to mend. \n The middle of the middle, and the end of the end? \n And finally, give me the sound often heard, \n during the search for a hard-to-find word. \n Now string them together and answer me this, \n Which creature would you be unwilling to kiss?");
		
		System.out.println("Your answer is:" +  ans2);
		if(ans2.equalsIgnoreCase("spiders")) {
			System.out.println("Your answer is correct!");
			score++;
		}
		else {
			System.out.println("Sorry, your answer is incorrect.");
			score--;

		}
		System.out.println("Current score is now: " + score);
		
		
		String ans3 = JOptionPane.showInputDialog("There is a house. One enters it blind and comes out seeing. What is it?");
		System.out.println("Your answer is:" + ans3);
			if(ans3.equalsIgnoreCase("school")) {
				System.out.println("Your answer is correct!");
				score++;
			}
			
			else {
				System.out.println("Sorry, your answer is incorrect.");
				score--;
			}
		System.out.println("Your final score is:" +  score);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
