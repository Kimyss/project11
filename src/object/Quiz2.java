package object;
/*
 * 3번째 예제에서 작성한 Student클래스 재사용하세요
 * Object형 변수 선언하고  Student객체 대입하세요
 * Object형 변수 사용해서 학번과 이름 출력하세요
 * */

public class Quiz2 {

	public static void main(String[] args) {
		
//		Object는 모든 클래스의 부모이기 때문에 형변환 가능
//		objst는 Student의 속성 사용불가 -> 다운캐스팅요망
		
		Object objSt = new Student(1100, "김객체");
				
		if (objSt instanceof Student) {
			Student student = (Student) objSt;
			System.out.println("학번: " + student.id);
			System.out.println("이름: " + student.name);
		}

	}

}
