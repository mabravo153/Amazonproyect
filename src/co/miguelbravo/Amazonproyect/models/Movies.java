package co.miguelbravo.Amazonproyect.models;

import java.util.ArrayList;
import java.util.Date;

public class Movies extends Film implements IVisualizable {
	private int id;
	private int timeViewed;
	
	
	public Movies(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration, year);
	}



	public int getId() {
		return id;
	}



	public int getTimeViewed() {
		return timeViewed;
	}



	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Genero: " + getGenre() + "\nTitulo: " + getTitle() + "\nCreador: " + getCreator() + 
				"\nDuracion: " + getDuration() + "min \nYear: " + getYear()
		;
	}



	public Date startViewed(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}



	public void stopViewed(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
		if (dateF.getSeconds() < dateI.getSeconds()) {
			setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
		}
		else {
			setTimeViewed(0);
		}
	}
		
	
	
	public static ArrayList<Movies> makeMovieslist(){
		ArrayList<Movies> movies = new ArrayList<Movies>();
				
				for (int i = 1; i <= 5; i++) {
					movies.add(new Movies("pelicula 1" + i, "genero 1 " +i , "creador 1" + i, 120 + i ,(short)(2017 + i )));
				}
				
				return movies;
	}



	@Override
	public void view() {
		// TODO Auto-generated method stub
		setViewed(true);
		
		//iniciamos_el_conteo
		Date dateI = startViewed(new Date());
		
		for (int i = 0; i < 100; i++) {
			System.out.println("mira la pelicula");
		}
		System.out.println("\n");
		

		//terminamos_verla
		stopViewed(dateI, new Date());
		System.out.println("Viste: " + toString() + "\nDuracion " + getTimeViewed()  );
	}

	
	
}
