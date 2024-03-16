package Management;

public class Book {
	private String booktitle;
	private String author;
	private int pub_year;
	private String isbn;
	private Category category;
	
	
	public Book (String booktitle, String author, int pub_year, String isbn, Category category) {
		this.booktitle = booktitle;
		this.author = author;
		this.pub_year = pub_year;
		this.isbn = isbn;
		this.category = category;
	}
	
	enum Category {
		SCIENCE("Spacetime and Geometry", "Cosmos", "Silent Spring"),
		PERSONAL_DEVELOPMENT("The Power of Positive Thinking", "Atomic Habits"),
		HISTORY("Guns, Germs and Steel", "The Wager");
		
    private String type;
    private String[] attributes;
    
    Category(String type, String... attributes) {
    	this.type = type;
    	this.attributes = attributes;
    }
		
	//Getting Enum
    public String getType() {
    	return type;
    }
    
   public String[] getAttributes() {
	   return attributes;
   }
    
	}
	
	
	//Getting Booktitle
	public String getBookTitle() {
		return booktitle;
	}
	
	//Setting Booktitle
	public void setBooktitle(String newTitle) {
		this.booktitle = newTitle;
	}
	
	//Getting Author
	public String getAuthor() {
		return author;
	}
	
	//Setting Author
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	// Getting Publishing Year
	public int getPubYear() {
		return pub_year;
	}
	
	//Setting Publishing Year
	public void setPubYear(int newPubYear) {
		this.pub_year = newPubYear;
	}
	
	//Getting ISBN
	public String getIsbn( ) {
		return isbn;
	}
	
	//Setting ISBN
	public void setIsbn(String newIsbn) {
		this.isbn = newIsbn;
	}
	
	//Getting Category
	public Category getCategory() {
		return category;
	}
	
	//Setting Category
	public void setCategory(Category newCategory) {
		this.category = newCategory;
	}
	
	//@Override
	public String toString() {
		return "\nBookTitle: " + booktitle + "\nAuthor: " + author + 
				"\nPubYear: " + pub_year + "\nIsbn: " + isbn + "\n";
	}
	

		

	}


