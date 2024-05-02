package wrapper;

import java.util.Scanner;

/*
 * Scanner클래스의 nextLine메소드 사용하여 정수두개 입력받으세요
 * 그리고 두 수를 더한 결과 출력
 * ex)10, 5
 * 
 * */

public class Quiz4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int changeNum = Integer.parseInt(num);
		int sum = 0;

		for (int i = 1; i <= 2; i++) {
			num = sc.nextLine();
			sum = sum + changeNum;
		}
		System.out.println(sum);

		
		System.out.println();
		System.out.println();
		
		String num1 = sc.nextLine(); // 첫번째 숫자 입력

		String num2 = sc.nextLine(); // 두번째 숫자 입력

		// 문자열을 숫자로 변환하고, 덧셈 수행
		int sum1 = Integer.parseInt(num1) + Integer.parseInt(num2);

		System.out.println("두 수의 합: " + sum1);
	}

}
