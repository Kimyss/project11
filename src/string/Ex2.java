package string;

public class Ex2 {

	public static void main(String[] args) {
		
		String str = "test";
		System.out.println("str 문자열 값: " + str + ", 주소" + str.hashCode());
		
		str = "aaa";
		System.out.println("str 문자열 값: " + str + ", 주소" + str.hashCode());
		
//		리터럴 (상수풀) 로 가리켰던 것이기에 다른객체 test 사용개능
//		new연산자 이용하여 객체 만들었으면 재사용 XX

	}

}
