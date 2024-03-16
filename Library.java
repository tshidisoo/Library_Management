package Management;

	import java.util.ArrayList;
	import Management.Book.Category;

	
    public class Library {

		private ArrayList<Book> books = new ArrayList<Book>();
		
		//Adding book method
		public void addBook(Book book) {
			books.add(book);
		}
		
		//Removing book method
		public void removeBook(Book book) {
			books.remove(book);
		}
		
		public void listAllBooks() {
			for (Book booktitle : books)
			{
				System.out.println(booktitle);}
		}
		
		// Method to list books in a particular category
		public void booksByCategory(Category category) {
		    for (Book book : books) {
		        if (book.getCategory() == category) {
		            System.out.println(book);
		        }
		    }
		}

	        
	    //Getting total books
	        public int totalBooks() {
	        	return books.size();
	        }
	        
	    //Listing books in year ranges
	        public void yearRange(int startYear, int endYear) {
	        for (Book book : books) {
	        	if (book.getPubYear() >= startYear && book.getPubYear() <= endYear) {
	                    System.out.println(book);
	        	}
	        }
	        }
		
				
	}
			

		
			        
	 

    

 
