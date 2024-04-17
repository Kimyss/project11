package string;
/*
 * 이전 문제 함수형태로 바꾸고 호출
 * getCharCount("자바 프로그래밍 입문") -> 9
 * getCharCount("equals 메소드는 두 객체가 같은지 비교한다")
 * */

public class Quiz4 {

	public static void main(String[] args) {

		System.out.println(getCharCount("자바 프로그래밍 입문"));
		System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다"));

	}


	public static int getCharCount(String text) {

		int cnt = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != ' ') {
				cnt++;
			}
		}
		return cnt++;
	}
}

//static 메소드는 new연산이나 객체 생성 없이 호출이 가능하다. 
//해서 많은 사용자들이 많이 호출되는 유틸 관련한 메서드에 static을 부여한다.