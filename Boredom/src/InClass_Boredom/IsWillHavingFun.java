package InClass_Boredom;

/**
 * @author Will
 * This is the beginning to my Java Programming Boredom section
 */

import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class IsWillHavingFun {
	static boolean isWillHavingFun;
	static boolean isWillLearning = false;
	
	Random rand = new Random();
	static Calendar cal = new GregorianCalendar();
	
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
		int current_Day = cal.get(Calendar.DAY_OF_WEEK);
		int hr = cal.get(Calendar.HOUR_OF_DAY);
	}
}