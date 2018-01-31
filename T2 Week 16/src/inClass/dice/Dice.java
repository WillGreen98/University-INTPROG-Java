package inClass.dice;

/**
 * @author Will
 * In Class Week 16
 */

import java.util.Random;

public class Dice {
	Random random = new Random();
	
	public Dice() {
		// Kinda useless... We only used class Dice to hold Random();
	}
	
	public int throwDice() {
		int roll = random.nextInt(6);
		
		return roll + 1;
	} 
	
	public static void main(String[] args) {
		Dice dice = new Dice();
		
		for(int i=0; i <= 10; i++) {
			int die_Throw = dice.throwDice();
			System.out.println(die_Throw);
		}
	}
}