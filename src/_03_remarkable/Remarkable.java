package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
          String khanh = "Smart";
          String diego = "Tactical";
          String rosendo = "Kind Hearted";
		// 2. Ask the user to enter a name. Store their answer in a variable.
  String userName = JOptionPane.showInputDialog(null, "What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
        if(userName.equalsIgnoreCase("khanh")) {
        	JOptionPane.showMessageDialog(null, "You're highly smart");
        }
        if(userName.equalsIgnoreCase("diego")) {
        	JOptionPane.showMessageDialog(null, "You're very good at robeats and your tactical.");
}       
        if(userName.equalsIgnoreCase("rosendo")) {
	JOptionPane.showMessageDialog(null, "You're very kind hearted.");
}
}
}