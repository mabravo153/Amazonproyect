package co.miguelbravo.Amazonproyect.models;

import java.util.ArrayList;

public class Chapters extends Movies {
	
	private int id;
	private int sessionNumber;
	
	public Chapters(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id; 
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	
  public static ArrayList<Chapters> makeChapterslist(){
	  ArrayList<Chapters> capitulos = new ArrayList<Chapters>();
	  
	  for (int i = 0; i <=6 ; i++) {
	capitulos.add(new Chapters("capitulo" + i, "genero"+i, "creador"+i,120+i, (short)(2007+i)));
	}
	 
	  return capitulos;
  }
 		
}
