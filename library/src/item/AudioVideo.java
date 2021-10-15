package item;

public class AudioVideo extends Item {
	private final int MAX_BORROW_DAY;
	public AudioVideo(String title, boolean borrowed, int year, int month, int dayOfMonth,int MAX_BORROW_DAY) {
		super(title, borrowed, year, month, dayOfMonth);
		this.MAX_BORROW_DAY=MAX_BORROW_DAY;
	}
	
	public int getMAX_BORROW_DAY() {
		return MAX_BORROW_DAY;
	}

	public void display() {
		System.out.println("Max borrow days: "+MAX_BORROW_DAY);
		this.print();
	}
}
