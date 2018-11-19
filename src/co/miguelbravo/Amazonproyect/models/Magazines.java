package co.miguelbravo.Amazonproyect.models;

import java.util.Date;
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
	
	public String isReaders() {
		return (readers)? "visto" : "no visto";
	}
	
	public void setReaders(Boolean readers) {
		this.readers = readers;
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
