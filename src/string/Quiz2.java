package string;

/*
 * 주빈번호 뒷자리 맨첫 숫자 
 * 주민번호 입력하면 성별 출력하도록
 * */

public class Quiz2 {

	public static void main(String[] args) {

		String pin = "991018-1143219";
		String pin2 = "001120-4068234";
		
		char a = pin2.charAt(7);
		System.out.println(a);
		
		if(a == '1' || a == '3') {
			System.out.println("성별은 남자");
		} else {
			System.out.println("성별은 여자");
		}
		

	}

}
