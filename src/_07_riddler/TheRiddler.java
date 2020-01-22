package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		
		
		int score=0;

		String answer = JOptionPane.showInputDialog("what do i have in my pocket?");
		//JOptionPane
if(answer.equals("nothing")) {
 JOptionPane.showMessageDialog(null, "correct");
 score++;
}
 else {
	 JOptionPane.showMessageDialog(null,"wrong");
		
 }	
		
String david = JOptionPane.showInputDialog("What can you hold in your left hand but not in your right?");
//JOptionPane
if(david.equals("Your right elbow")) {
JOptionPane.showMessageDialog(null, "correct");
score++;
}
else {
JOptionPane.showMessageDialog(null,"wrong");

}	

		
		

		
	


String daniel = JOptionPane.showInputDialog("Re-arrange the letters, O O U S W T D N E J R, to spell just one word. What is it??");
//JOptionPane
if(daniel.equals("just one word")) {
JOptionPane.showMessageDialog(null, "correct");
score++;
}
else {
JOptionPane.showMessageDialog(null,"wrong");

}	

		
		

		
	}
}

