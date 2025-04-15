package week2.day1;

public class Library {
	
	//addBookd method with return
	public String addBook(String bookTitle) {
		System.out.println("Books added successfully");
		return bookTitle;
		
	}
	//issueBook method creating
	public void issueBook() {
		System.out.println("Book issued Successfully");
		
	}
    //main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object named as books
		Library books=new Library();
		//calling methods by using object
		books.addBook("Kalam");
		books.issueBook();

	}

}
