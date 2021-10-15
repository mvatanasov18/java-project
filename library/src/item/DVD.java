package item;

public class DVD extends AudioVideo{
private String director;

public DVD(String title, boolean borrowed, int year, int month, int dayOfMonth,int MAX_BORROW_DAY,String director) {
	super(title, borrowed, year, month, dayOfMonth,MAX_BORROW_DAY);
	this.director=director;
}

public String getDirecor() {
	return director;
}

public void setDirecor(String direcor) {
	this.director = direcor;
}
public void print() {
	System.out.println("Director: "+director);
	this.display();
}
}
