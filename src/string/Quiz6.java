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
			System.out.print("문자열 입력하셔요: ");
			
			String str = sc.nextLine();

//			문자열이 "END" 또는 "end" 라면 루프 종료 
			
			if (str.equals("end") || str == "END") {
				break;
			}
//			if(str.equalsIgnoreCase("end")) {
//				break;
//			}
//			if(str.toLowerCase().equals("end")) {
//				break;
//			}
//			
		}
//		.equals: 내용 비교 | ==: 주소비교
//		break;  반복문종료
//		countinue; 반복문 스킵
//		체이닝기법 .toLowerCase().equals 소문자 변환 후 문자열객체 .찍어 다시호출
	}
}
