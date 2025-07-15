package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library book = new Library();
		String book1 = book.addBook("Its a scienec book");
		System.out.println(book1);
		book.issueBook();
		}
	

}
