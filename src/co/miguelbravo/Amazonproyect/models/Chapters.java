package co.miguelbravo.Amazonproyect.models;

import java.util.ArrayList;

public class Chapters extends Movies {
	
	private int id;
	private int sessionNumber;
	private  Series serie;
	
	public Chapters(String title, String genre, String creator, int duration, short year, int sessionNumber, Series serie) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionNumber(sessionNumber);
		this.setSerie(serie);
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id; 
	}
	
	public  Series getSerie() {
		return serie;
	}
	
	public void setSerie(Series serie) {
		this.serie = serie;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	public String toString() {
		return "\n Serie " +
	
				"\n Title" + getSerie().getTitle() +
				"\n Chapter" +
				"\n Title " + getTitle()+
				"\n Year " + getYear() +
				"\n Creator " + getCreator()+
				"\n Duration " + getDuration();

	}
	
  public static ArrayList<Chapters> makeChapterslist(Series serie){
	  ArrayList<Chapters> capitulos = new ArrayList<Chapters>();
	  
	  for (int i = 0; i <=6 ; i++) {
	capitulos.add(new Chapters("capitulo" + i, "genero"+i, "creador"+i,120+i, (short)(2007+i),i, serie ));
	}
	 
	  return capitulos;
  }
  
  @Override
public void view() {
	// TODO Auto-generated method stub
	super.view();
	ArrayList<Chapters> chapter = getSerie().getChapter();
	int chapterViewCounter = 0;
	for (Chapters chapters : chapter) {
		if (chapters.getIsViewed()) {
			chapterViewCounter++;
		}
	}
	if (chapterViewCounter == chapter.size()) {
		getSerie().setViewed(true);
	}
	
}	

 		
}
