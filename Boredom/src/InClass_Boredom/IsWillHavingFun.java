package InClass_Boredom;

/**
 * @author Will
 * This is the beginning to my Java Programming Boredom section
 */

import java.util.Random;
import java.util.Calendar;

public class IsWillHavingFun {
	static boolean isWillHavingFun;
	static boolean isWillLearning = false;
	
	Random rand = new Random();
	Calendar cal = Calendar.getInstance();

	public static void main(String[] args) {
		int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);
        
		int rand_Num = (int)(Math.random() * (high - low)) + low;
		
		System.out.println("Hello World!");
		
		if(rand_Num == 1) {
			isWillHavingFun = true;
			System.out.println("Will is having fun");
		} else {
			if(isWillLearning = false) {
				isWillHavingFun = true;
			}
			
			isWillHavingFun = false;
			System.out.println("Will is Bored");
		}	
	}
}