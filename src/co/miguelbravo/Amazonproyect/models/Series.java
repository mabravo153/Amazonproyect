package co.miguelbravo.Amazonproyect.models;

import java.util.ArrayList;

public class Series extends Film {
	
	private int timeViewed;
	private int sessionQuantity;
	private ArrayList<Chapters> chapter;
	
	
	
	public Series(String title, String genre, String creator, int duration, short year, int sessionQuantity, ArrayList<Chapters> capitulos) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.sessionQuantity =  sessionQuantity;
		this.chapter = capitulos;
	}

	
	
	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapters> getChapter() {
		return chapter;
	}

	public void setChapter(ArrayList<Chapters> chapter) {
		this.chapter = chapter;
	}
	
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Genero: " + getGenre() + "\nTitulo: " + getTitle() + "\nCreador: " + getCreator() + 
				"\nDuracion: " + getDuration() + "Temporada \nYear: " + getYear()
		;
	}
	
	
	public static ArrayList<Series> makeSerielist(){
	ArrayList<Series> series = new ArrayList<Series>(); 
	
		for (int i = 0; i <=5 ; i++) {
			series.add(new Series("titulo" + i, "genero" + i,"creador" + i , 120 + i,(short)(2017+i), i, Chapters.makeChapterslist() ));
		}
		
		return series;
	}
	

	

}
