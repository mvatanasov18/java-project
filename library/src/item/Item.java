package item;

public class Item {
	private String title;
	private boolean borrowed;
	private int year;
	private int month;
	private int dayOfMonth;
	
	public Item(String title, boolean borrowed, int year, int month, int dayOfMonth) {
		super();
		this.title = title;
		this.borrowed = borrowed;
		this.year = year;
		this.month = month;
		this.dayOfMonth = dayOfMonth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public void print() {
		System.out.println("title: " + title);
		System.out.println("borrowed: " + borrowed);
		System.out.println("year: " + year);
		System.out.println("month: " + month);
		System.out.println("day: " + dayOfMonth);
	}
}
