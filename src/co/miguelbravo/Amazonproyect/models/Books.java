package co.miguelbravo.Amazonproyect.models;

import java.security.PublicKey;
import java.sql.Date;
import java.util.ArrayList;

public class Books extends Impreso implements IVisualizable {
	
	private int id ;
	private String isbn;
	private boolean readers;
	private int timeReaders;
	
	
	
	public Books(String title, Date editionDate, String editorial, String[] autors) {
		super(title, editionDate, editorial, autors);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "\nTitulo: " + getTitle() + "\nDia Edicion: " + getEditionDate() + 
				"\nEditorial: " + getEditorial()
		;
	}

	public int getId() {
		return this.id;
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String isReaders() {
		return (readers)? "visto" : "no visto";
	}

	public void setReaders(boolean readers) {
		this.readers = readers;
	}

	public int getTimeReaders() {
		return timeReaders;
	}

	public void setTimeReaders(int timeReaders) {
		this.timeReaders = timeReaders;
	}
	

	public Date startViewed(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}



	public void stopViewed(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
		if (dateF.getSeconds() < dateI.getSeconds()) {
			setTimeReaders(dateF.getSeconds() - dateI.getSeconds());
		}
		else {
			setTimeReaders(0);
		}
	
	}
	
	
	public java.util.Date startViewed(java.util.Date dateI) {
		// TODO Auto-generated method stub
		return null;
	}

	public void stopViewed(java.util.Date dateI, java.util.Date dateF) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static ArrayList<Books> makeBookslist(){
		ArrayList<Books> libros = new ArrayList<Books>();
		String autors [] = {"gabriel garcia marquez", "pablo neruda", "eperanza gomez", "james rodrigues","karol marquez","julieta venegas" };
		
		for (int i = 1; i <=6; i++) {
			libros.add(new Books("book " + i, new Date(i), "planeta" ,autors));
			
		}
		
		return libros;
	}
}
