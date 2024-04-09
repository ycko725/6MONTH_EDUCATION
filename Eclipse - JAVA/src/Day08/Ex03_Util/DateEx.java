package Day08.Ex03_Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) throws ParseException {
		// Date 객체는 시스템에서 현재 날짜를 가져온 정보를 가지고 있다
		Date now = new Date();
		System.out.println("now : " + now);
		
		String dateStr = now.toString();
		System.out.println("Date 문자열 기본 포맷 : " + dateStr);
		
		// 날짜/시간 문자
		// yyyy : 년도, MM : 월, dd : 일
		// hh	: 시간, mm : 분, ss : 초
		String dateFormat = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
		
		String day1 = "2023/01/30";		// 개강일
		String day2 = "2023/07/21";		// 종강일

		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(day1);
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse(day2);
		
		// Date.getTime()
		// : 1970년1월1일0시0분0초0ms 부터 Date에 지정된 날짜/시간 까지의 ms 누적값
		long gapDays = (date2.getTime() - date1.getTime()) / (1000*60*60*24);
		long gapHours = (date2.getTime() - date1.getTime()) / (1000*60*60);
		long gapMin = (date2.getTime() - date1.getTime()) / (1000*60);
		long gapSec = (date2.getTime() - date1.getTime()) / (1000);
		
		System.out.println("종강 D-day : " + gapDays);
		System.out.println("종강까지 남은 시간(/시) : " + gapHours);
		System.out.println("종강까지 남은 시간(/분) : " + gapMin);
		System.out.println("종강까지 남은 시간(/초) : " + gapSec);
		
		// Date 객체의 getXXX() 메소드는 deprecated(더 이상 사용불가)
		// --> 날짜의 년/월/일을 추출하는 기능은 Calendar 클래스에서 주로 다룬다
		System.out.println("Today (년) : " + date1.getYear());
		System.out.println("Today (월) : " + date1.getMonth() + 1);
		System.out.println("Today (일) : " + date1.getDate());
		
		// 2023/02/09 : 5일 후
		// 2023/02/09 : 10일 후
		// 2023/02/09 : 100일 후
		Date today = new Date();
		System.out.println("오늘 : " + today);
		
		int dayTime = (1000 * 60 * 60 * 24);		// ms 단위로 1일을 환산한 값
		int day5TimeValue = 5 * dayTime;		
		int day10TimeValue = 10 * dayTime;		
		int day100TimeValue = 100 * dayTime;		
		
		// 5일 후
		Date after5Days = new Date();
		after5Days.setTime( today.getTime() + day5TimeValue );
		String after5DaysStr = sdf.format(after5Days);
		System.out.println(after5DaysStr);
		
		// 10일 후
		Date after10Days = new Date();
		after10Days.setTime( today.getTime() + day10TimeValue );
		String after10DaysStr = sdf.format(after10Days);
		System.out.println(after10DaysStr);
		
		// 올바르지 않은 결과가 나온다
		// 날짜 계산하는 경우는 Calendar 클래스를 사용할 것을 권장
		// 100일 후
		Date after100Days = new Date();
		after100Days.setTime( today.getTime() + day100TimeValue );
		String after100DaysStr = sdf.format(after100Days);
		System.out.println(after100DaysStr);
		
		
		
		

		
	}

}

















