package Day08.Ex03_Util;

import java.util.Calendar;

public class CalendarPrint {
	
	public static void printCalendar(String msg, Calendar cal) {
		
		int year = cal.get(Calendar.YEAR);					// 2023
		int month = cal.get(Calendar.MONTH) + 1;			// 0~11
		int day = cal.get(Calendar.DAY_OF_MONTH);			// 1~31
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);		// 일~토 (1~7)
		int hour = cal.get(Calendar.HOUR);					// 12시 표시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);		// 24시 표시
		int ampm = cal.get(Calendar.AM_PM);					// AM PM
		int minute = cal.get(Calendar.MINUTE);				// 0~59
		int second = cal.get(Calendar.SECOND);					// 0~59
		int millisecond = cal.get(Calendar.MILLISECOND);	// 1/1000 초
		
		System.out.print(msg + year + "/" + month + "/" + day + "/");
		
		// 일요일(1) ~ 토요일(7)
		String Day = "";
		switch (dayOfWeek) {
			case Calendar.SUNDAY:		Day = "일요일"; break;	
			case Calendar.MONDAY: 		Day = "월요일"; break;	
			case Calendar.TUESDAY: 		Day = "화요일"; break;	
			case Calendar.WEDNESDAY: 	Day = "수요일"; break;	
			case Calendar.THURSDAY: 	Day = "목요일"; break;	
			case Calendar.FRIDAY: 		Day = "금요일"; break;	
			case Calendar.SATURDAY: 	Day = "토요일"; break;	
		}
		System.out.print(Day);
		System.out.print("(" + hourOfDay + "시)");
		if( ampm == Calendar.AM ) 
			System.out.print("오전 ");
		if( ampm == Calendar.PM )
			System.out.print("오후 ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초 " );
	}
	
	public static void main(String[] args) {
		// 2023년2월9일 PM 4시00분 ...
		
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
		
		Calendar test = Calendar.getInstance();
		test.set(2023, Calendar.MARCH, 14);
		printCalendar("다음일정 ", test);
		
		// 종강일
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(2023, Calendar.JULY, 21);
		
		
		// getTimeInMillis()	: 날짜를 ms단위까지 숫자로 반환
		// 1970년 1월 1일 0시 0분 0초 0ms 부터 카운트한 숫자를 반환
		// 0.001초 	: 1ms
		// 60초 		: 1분
		// 60분		: 1시간
		// 24시		: 1일
		long nowT = now.getTimeInMillis() / (1000*60*60*24);
		long lastT = lastDay.getTimeInMillis() / (1000*60*60*24);
		System.out.println("1970년1월1일~오늘날짜까지 일수 : " +  nowT);
		System.out.println("1970년1월1일~종강날짜까지 일수 : " +  lastT);
		System.out.println("D-Day : " + (lastT - nowT) + " 일");
		
		
		
	}

}





















