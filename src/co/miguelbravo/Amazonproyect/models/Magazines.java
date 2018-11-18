package co.miguelbravo.Amazonproyect.models;

import java.sql.Date;

public class Magazines extends Impreso {
	
	private int id ;
	private String isbn;
	private boolean readers;
	private int timeReaders;
	
	
	
	public Magazines(String title, Date editionDate, String editorial, String[] autors) {
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
	
	public int getTimeReaders() {
		return timeReaders;
	}
	public void setTimeReaders(int timeReaders) {
		this.timeReaders = timeReaders;
	}
	
	
	
	
	
	
}
