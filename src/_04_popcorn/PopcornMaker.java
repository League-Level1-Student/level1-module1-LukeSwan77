package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor would you like your popcorn to be?");
	Popcorn pop = new Popcorn(flavor);
	String time = JOptionPane.showInputDialog("How long do you wnat to cook your popcorn?");
	int cookTime = Integer.parseInt(time);
	Microwave mike = new Microwave();
	mike.setTime(cookTime);
	mike.putInMicrowave(pop);
	mike.startMicrowave();
	pop.applyHeat();
	pop.eat();
}
}
