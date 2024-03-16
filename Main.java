package Management;
import java.util.ArrayList;
import Management.Library;
import Management.Book;
import Management.Book.Category;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library myBook = new Library();
		
		myBook.addBook(new Book("Spacetime and Geometry", "Sean Carroll", 2003, "Varies based on the edition", Category.SCIENCE));
		myBook.addBook(new Book("Cosmos", "Carl Sagan", 1980, "Varies based on the edition",Category.SCIENCE));
		myBook.addBook(new Book("Silent Spring", "Rachel Carson", 1962, "Varies based on the edition", Category.SCIENCE));
		myBook.addBook(new Book("The Power of Positive Thinking", "Norman Vincent Peale", 1952, "Varies based on the edition",Category.PERSONAL_DEVELOPMENT));
		myBook.addBook(new Book("Atomic Habits", "James Clear", 2018, "Varies based on the edition", Category.PERSONAL_DEVELOPMENT));
		myBook.addBook(new Book("Guns, Germs, and Steel", "Jared Diamond", 1997, "Varies based on the edition", Category.HISTORY));
		myBook.addBook(new Book("The Wager", "Blaise Pascal", 1662, "Varies based on the edition",Category.HISTORY ));
		
        myBook.listAllBooks();
		
		//myBook.booksByCategory(Category.PERSONAL_DEVELOPMENT);
		
		//myBook.yearRange(1500, 1900);
		}
	

}
