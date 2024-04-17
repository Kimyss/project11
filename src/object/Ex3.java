package object;

public class Ex3 {

	public static void main(String[] args) {
		
		Student student1 = new Student(1001, "김같음");
		Student student2 = new Student(1001, "김같음");
		
//		비교 연산자는 메모리 주소로 비교
		if(student1 == student2) {
			System.out.println("student1과 student2의 주소는 같습니다");
		} else {
			System.out.println("student1과 student2의 주소는 다릅니다");
		}
		
//		equals 메소드는 오버라이드되서, 학생의 학번으로 비교. (1001 ==1001)
		if(student1.equals(student2)) {
			System.out.println("student1과 student2는 같은학생 입니다");
		}else {
			System.out.println("student1과 student2의 다른학생 입니다");
		}

	}

}

// 학생 클래스
class Student{
	
	int id;		
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			
			Student student = (Student) obj;
			if(this.id == student.id) {
				return true;
			}
		}
		return false;
	}
	
	
}

