package item;

public class Novel extends Book {
public Novel(String title, boolean borrowed, int year, int month, int dayOfMonth, int MAX_BORROW_DAY) {
		super(title, borrowed, year, month, dayOfMonth, MAX_BORROW_DAY);
		
	}


public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
private int isbn;
private String genre;
}
