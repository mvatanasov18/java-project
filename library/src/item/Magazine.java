package item;

public class Magazine extends Book {
	
	
	public Magazine(String title, boolean borrowed, int year, int month, int dayOfMonth, int MAX_BORROW_DAY) {
		super(title, borrowed, year, month, dayOfMonth, MAX_BORROW_DAY);
		
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int volume;
	private String type;
}
