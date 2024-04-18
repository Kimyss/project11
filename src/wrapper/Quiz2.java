package wrapper;
/*
* 2.
* 정수 10 문자열변수에 저장
* 실수 1.123 문자열변수
* 문자 c 문자열 변수
* boolean타입 true문자열 변수 저장 하세요
* */

public class Quiz2 {

	public static void main(String[] args) {
		

//		숫자를 문자열로 변환 하려면 toString 메소드 사용
		
		String str1 = Integer.toString(10);	//10 -> "10"
		String str2 = Double.toString(1.123);
		String str3 = Character.toString('c');
		String str4 = Boolean.toString(true);
		
		System.out.println(str1);
		
		String str5 = String.valueOf(10);
		String str6 = String.valueOf(1.123);
		String str7 = String.valueOf('c');
		String str8 = String.valueOf(true);
		
	}

}
