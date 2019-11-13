package _02_unbirthday;

import javax.swing.JOptionPane;

public class unhappybirthday  {
	
	public static void main(String[] args) {
	String bday=JOptionPane.showInputDialog("when is your bday");
	if(bday.equals("10/29")){
	  JOptionPane.showMessageDialog(null,"happybday"); 
	}else {
	JOptionPane.showMessageDialog(null,"un happy bday");
	}
	
	

}

}