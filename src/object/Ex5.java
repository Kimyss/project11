package object;

public class Ex5 {

	public static void main(String[] args) {
//		클래스타입의 String : 미리 toString, equals같음 함수들이 재정의 되어있음
		
		String str1 = new String("test");
		
		System.out.println(str1.toString());
		System.out.println(str1);
		
		String str2 = new String("test");
		if (str1.equals(str2)) {
			System.out.println("str1 str2 같은문자열");
		}
		if (str1 == str2) {
			System.out.println("str1 str2 같은문자열");
		} else {
			System.out.println("주소다름");
		}

		System.out.println();
		
//		나홀로.. TEST
		String a = "구름";
		String b = "구름";
		boolean c = a == b;
		boolean d = a.equals(b);
		System.out.println(c);
		System.out.println(d);
	}

}
