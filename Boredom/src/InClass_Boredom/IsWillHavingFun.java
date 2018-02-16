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
	
	public static void main(String[] args) {
		Calendar_Att cal_Att = new Calendar_Att();
		Calendar gCal = new GregorianCalendar();
		
		
	    System.out.println(Locale.getDefault() + ": " + (gCal.getFirstDayOfWeek() - 1) + " " + cal_Att.hourOfDay);   
	}
}