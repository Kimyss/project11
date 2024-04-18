package wrapper;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
//		list자료형으로 기초타입X
		
		list.add(true);		//오토박싱. 값을 저장하는 순간 변
		list.add(true);		//new Boolean(true)로 변환됨 (오토박싱)
		list.add(false);
		
		boolean b = list.get(0);
//		list.get(0).booleanValue()로 변환됨 (언박싱)
		
		
		

	}

}
