package level1;

import java.util.Calendar;
import java.util.Locale;

public class CalLeapYear {
	public String getDayName(int month, int day){	
		int a = 1;
		int b = 1;
        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
	
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		int date = 0;
		for(int i = 0; i < a-1; i++) {
			date += months[i];
		}
		System.out.println(weeks[(date+b+4)%7]);
		//return weeks[(date+b+4)%8];
	}
}