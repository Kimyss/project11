package string;
/*
 * Scanner 클래스의 nextLine메소드 사용하여 문자열 입력받
 * 문자열 거꾸로 출력
 * "안녕하세요" => "요세하녕안"
 * */

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		 
		// 1. 하드코딩
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(2));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(0));

		// 2.문자열에서 뒤에서부터 한 글자씩 출력
		int i = str.length() - 1;
		while (i >= 0) {
			System.out.print(str.charAt(i));
			i--;
		}

		// 3.
		for (int j = 4; j >= 0; j--) { // 1씩 감소
			System.out.print(str.charAt(j));
		}

		// 4.StringBuilder 클래스 사용
		StringBuilder builder = new StringBuilder(str);
		builder.reverse(); // 문자열을 거꾸로 변경하기
		System.out.println(builder.toString());

	}

}
