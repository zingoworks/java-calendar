package zingoworks.calendar;

import java.util.Scanner;

public class Calendar {
	// 최대일수 구하는 로직 함수로 빼기 < 재사용 가능
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}else {
		return false;
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	/*
	- 월을 입력하면 해당월의 달력을 출력한다.
	- 달력의 모양은 1단계 작성 형태
	- 1일은 일요일로 정해도 무방하다.
	- -1을 입력받기 전까지 반복 입력받는다.
	- 프롬프트를 출력한다.
	*/

	public void printCalendar(int year, int month) {
		System.out.printf("     <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		

		int maxDay = getMaxDaysOfMonth(year, month);

		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if (i% 7 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		
		
//		System.out.println(" 1   2   3   4   5   6   7");
//		System.out.println(" 8   9  10  11  12  13  14");
//		System.out.println("15  16  17  18  19  20  21");
//		System.out.println("22  23  24  25  26  27  28");
//			
			
			
//			
//			System.out.println("    <<%4d %3d>>", 2017, month);
//			System.out.println(" 일      월      화      수      목      금      토");
//			System.out.println("--------------------------");
//			System.out.println(" 1   2   3   4   5   6   7");
//			System.out.println(" 8   9  10  11  12  13  14");
//			System.out.println("15  16  17  18  19  20  21");
//			System.out.println("22  23  24  25  26  27  28");
//			break;
//		case 30:
//			System.out.println(" 일      월      화      수      목      금      토");
//			System.out.println("--------------------------");
//			System.out.println(" 1   2   3   4   5   6   7");
//			System.out.println(" 8   9  10  11  12  13  14");
//			System.out.println("15  16  17  18  19  20  21");
//			System.out.println("22  23  24  25  26  27  28");
//			System.out.println("29  30                    ");
//			break;
//		default:
//			System.out.println(" 일      월      화      수      목      금      토");
//			System.out.println("--------------------------");
//			System.out.println(" 1   2   3   4   5   6   7");
//			System.out.println(" 8   9  10  11  12  13  14");
//			System.out.println("15  16  17  18  19  20  21");
//			System.out.println("22  23  24  25  26  27  28");
//			System.out.println("29  30  31                ");
//			break;
	}

}



