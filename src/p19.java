/* 
 * Solution to Project Euler problem 21
 * by Gene Horecka
 * 
 * June 22, 2016
 * 
 * https://github.com/genefever/ProjectEulerSolutions
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class p19 {

	public static void main(String[] args) {
		final int SUNDAY = 0;
		int year = 1901, month = 0;
		int numSundays = 0;
		GregorianCalendar cal = new GregorianCalendar(year, month, SUNDAY);
		
		while(cal.get(cal.YEAR) < 2001) {
			
			if(isSunday(cal)) {
				numSundays++;
			}
			
			if(cal.get(Calendar.MONTH) == 11) {
				month = 0;
				year++;
				cal.set(cal.YEAR, year);
			} else {
				month++;
			}
			
			cal.set(cal.MONTH, month);
		}
		
		System.out.println(numSundays);
	}
	
	public static boolean isSunday(GregorianCalendar cal) {
		return (cal.get(cal.DAY_OF_WEEK) == cal.SUNDAY);
	}

}
