package string;

public class Ex3 {

	public static void main(String[] args) {
		
		String str = "java";
		System.out.println("str의 주소 " + System.identityHashCode(str));
		
		str = str + " and";	//문자열 추가
		str = str + " andriod";
		System.out.println("값 변경 후 str의 주소: " + System.identityHashCode(str));
		System.out.println(str);
		
		System.out.println();
		
		StringBuilder buffer = new StringBuilder();
		System.out.println("Buffer의 주소: " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println("값 변경 후 buffer의 주소: " + System.identityHashCode(buffer));
		System.out.println(buffer.toString());
		System.out.println(buffer);
		
//		System.identityHashCode(), hashCode() 진법차이 정도만 있다고 알고 넘어가도록

	}

}
