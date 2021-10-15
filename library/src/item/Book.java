package item;

public class Book extends Item {
	private String author;
	private int pages;
	private String publisher;
	private int MAX_BORROW_DAY;

	public Book(String title, boolean borrowed, int year, int month, int dayOfMonth,int MAX_BORROW_DAY) {
		super(title, borrowed, year, month, dayOfMonth);
		this.MAX_BORROW_DAY=MAX_BORROW_DAY;
	}
	public int getMaxBorrowDay() {
		return MAX_BORROW_DAY;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
