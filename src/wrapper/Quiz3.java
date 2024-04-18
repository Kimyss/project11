package wrapper;
/*
 * 문자 저장하는 리스트 생성 a,b,c,d 저장
 * 리스트 안에 저장된 모든문자 꺼내서 출력
 * 오토박싱, 언박싱 발생부분 찾아
 * */

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		 ArrayList<Character> list = new ArrayList<Character>();
		 
		 list.add('a');		//오토박싱: 값을 저장하는 순간 저장  String타입으로 저장(?) list.add(new Character('a'))로 변환딤
		 list.add('b');
		 list.add('c');
		 list.add('d');
		 
		Character a = list.get(0);		// 언박싱 : list.get(i).charValue()으로 변환됨.(언박싱)
		Character b = list.get(1);
		Character c = list.get(2);
		Character d = list.get(3);
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			char ch = list.get(i); 		//list.get(i).charValue()으로 변환됨. (언박싱)
			System.out.println(ch);
		}

	}

}
