package co.miguelbravo.Amazonproyect.models;

import java.sql.Date;
import java.util.ArrayList;

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
	
	public static ArrayList<Magazines> makeMagazineslist(){
		ArrayList<Magazines> revistas = new ArrayList<Magazines>();
		String autors [] =new String[5];
		for (int j = 0; j < autors.length; j++) {
			autors[j] = "autores" + j;
		}
		
		for (int i = 0; i <=5; i++) {
			revistas.add(new Magazines("playboy" +i , new Date(i), "luna nueva", autors) );
		}
		
		
		return revistas;
	}
	
	
	
	
}
