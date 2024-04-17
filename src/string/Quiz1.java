package string;
/*
 * 1. 문자열 "a:b:c:d"을 만드세요.
 *    그리고 문자열을 "a#b#c#d"로 변경하세요.
 *    
 * 2. "안녕하세요 저는 둘리입니다" 라는 문자열을 만드세요.
 *    그리고 문자열에서 "둘리" 부분만 추출하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		
		String text = "a:b:c:d";
		text.replace(":", "#");
		System.out.println(text);
		
		String hello = "안녕하세요 저는 둘리입니다";
		
		System.out.println(hello.indexOf("둘"));
		hello = hello.substring(9, 11);
		System.out.println(hello);
		System.out.println();
		

	}

}
