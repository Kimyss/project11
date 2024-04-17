package string;
/*
 * "자바 프로그래밍 입문" 문자열 생성
 * 공백 제외한 글자수만세어서 출력
 * ex) "자바 프로그래밍 입문" -> 9 (전체:11 공백2)
 * */

public class Quiz3 {

	public static void main(String[] args) {

		String text = "자바 프로 그 래밍 입문";
		
		
		int cnt = 0;
		for (int i =0; i < text.length(); i++) {
			if(text.charAt(i) != ' ') {
				cnt++;
			}
		}
		System.out.println(text.length());	//공백포함	
		System.out.println(cnt);		//공백제거
	}

}
