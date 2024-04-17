package object;
/*
 * 연도 월 일 멤버로 가지는 Date 클래스
 * 인스턴스 두개 생성
 * MyDate date1 =new MyDate(2024,4,16);
 * MyDate date2 =new MyDate(2024,4,16);
 * 날짜 내용 같은지 비교하도록 equals 메소드 재정의
 * */

public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2024, 4, 16);
		MyDate date2 = new MyDate(2024, 4, 16);

		if (date1 == date2) {
			System.out.println("date1과 date2 같다 ==");
		} else {
			System.out.println("date1과 date2 다르다(!=)");
		}

		if (date1.equals(date2)) {
			System.out.println("date1과 date2 같다(equals)");
		} else {
			System.out.println("date1과 date2 다르다");
		}

		System.out.println();
		
		MyDate date3 = new MyDate(2024, 4, 16);
		MyDate date4 = new MyDate(2024, 4, 17);
		
		if (date3.equals(date4)) {
			System.out.println("date1과 date2 같다(equals)");
		} else {
			System.out.println("date1과 date2 다르다");
		}
		
	}
}

class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate mydate = (MyDate) obj;
			if(this.day == mydate.day && this.month == mydate.month && this.year == mydate.year) {
				return true;
			}
		}
		return false; // 모든 경우의수를 만족하지 못하기에 if문 안에 else문에 있으면 에러 (return값 - 어떠한 경우에도 값을 반환해야)
	}

}
