package item;

public class CD extends AudioVideo {
	private String artist;
	private int numberOfTracks;

	public CD(String title, boolean borrowed, int year, int month, int dayOfMonth,int MAX_BORROW_DAY,String artist) {
		super(title, borrowed, year, month, dayOfMonth,MAX_BORROW_DAY);
		this.artist=artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public void print() {
		System.out.println("artist: " + artist);
		System.out.println("Number of tracks: " + numberOfTracks);
		this.display();
	}
}
