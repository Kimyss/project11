package object;

public class Ex4 {

	public static void main(String[] args) {
		
		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book);		//참조변수 출력 = .toString와 같다
		
		Book book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());

	}

}

class Book {

	int bookNumber;
	String bookTitle;

	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

//	source > generate toString() 메뉴
//	어차피 똑같은 기능, 자주사용 건들필요 X ~

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

}
