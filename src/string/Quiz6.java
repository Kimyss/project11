package string;

import java.util.Scanner;

/*
 * Scanner 클래스의 nextLine메소드를 사용하여 문자열 입력
 * END 또는 end 입력되면 루프종료
 * while(true) 사용하여 무한루프
 * */

public class Quiz6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			
			if (str.equals("end") || str == "END") {
				break;
			}
		}
	}
}
