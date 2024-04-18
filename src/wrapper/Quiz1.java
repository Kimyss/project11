package wrapper;

/*
 * 1.
 * 문자열 "10" byte, short, int, long로 변환하세요
 * 문자열 "10.0" float, double로 변환하세요
 * 
 * 2.
 * 정수 10 문자열변수에 저장
 * 실수 1.123 문자열변수
 * 문자 c 문자열 변수
 * boolean타입 true문자열 변수 저장 하세요
 * */
public class Quiz1 {

	public static void main(String[] args) {

//		문자열을 숫자로 변환 하려면 "parse" 메소드사용
//		wrapper 클래스: 자료형을 바꾸는 함수 가지고 있다.
		byte a = Byte.parseByte("10");
		short b = Short.parseShort("10");
		int c = Integer.parseInt("10");
		long d = Long.parseLong("10");

		float f = Float.parseFloat("10.0");
		double g = Double.parseDouble("10.0");

	}

}
