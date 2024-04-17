package object;
//다음과 같이 강아지 클래스 (Dog) 만드세요
//멤버변수: 이름(name) 품종(type)
//이름은 멍멍이 품종은 진돗개 강아지 객체 생성
//다음과 같이 출력되도록 toString 메소드를 재정의하세요.
//System.out.println(dog) -> "진돗개 멍멍이"

public class Quiz3 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.name = "멍멍이";
		dog1.type = "진돗개";
		
		System.out.println(dog1.toString());
		System.out.println(dog1);			//dog.toString와 같음

	}

}

class Dog{
	String name;
	String type;
	
	
//	강아지 이름과 품종 출력되도록 재정의
	public String toString() {
		return type + " " + name;
	}
	
////	@Override
////	public String toString() {
////		return "Dog [name=" + name + ", type=" + type + "]";
////	}
//	
	
}
