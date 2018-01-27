package InClass_Boredom;

import java.util.Calendar;

public class Calendar_Att {
	public Calendar calendar;
	
	int year       = calendar.get(Calendar.YEAR);
	int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
	int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
	int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
	int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

	int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
	int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
	int minute     = calendar.get(Calendar.MINUTE);
	int second     = calendar.get(Calendar.SECOND);
	int millisecond= calendar.get(Calendar.MILLISECOND);
}
