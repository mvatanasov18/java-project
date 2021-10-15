package item;

public class Journal extends Book {
	
	
	public Journal(String title, boolean borrowed, int year, int month, int dayOfMonth, int MAX_BORROW_DAY) {
		super(title, borrowed, year, month, dayOfMonth, MAX_BORROW_DAY);
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int isbn;
	private String type;
}
