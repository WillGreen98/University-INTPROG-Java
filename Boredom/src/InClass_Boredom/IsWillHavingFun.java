package InClass_Boredom;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Will
 * This is the beginning to my Java Programming Boredom section
 */

import InClass_Boredom.Calendar_Att;

public class IsWillHavingFun {	
	static boolean isWillHavingFun;
	static boolean isWillLearning = false;
	
	public static boolean rand_Number() {
		int low = 0;
        int high = 1;
        
		int rand_Num = (int)(Math.random() * (high - low)) + low;
		
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
		
		return isWillHavingFun;
	} 

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
	    System.out.println(Locale.getDefault() + ": " + (c.getFirstDayOfWeek() - 1));   
	}
}