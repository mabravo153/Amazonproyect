package co.miguelbravo.Amazonproyect.models;

import java.security.PublicKey;
import java.util.Date;
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
	

	
	public static ArrayList<Books> makeBookslist(){
		ArrayList<Books> libros = new ArrayList<Books>();
		String autors[] = new String[3];
		for (int j = 0; j < 3; j++) {
			autors[j] = "autor" + j;
		}
		for (int i = 0; i <= 5; i++) {
			libros.add(new Books("book " + i, new Date(i), "planeta" ,autors));
			
		}
		return libros;
	}
	
	public void view () {
		setReaders(true);
		
		Date dateI = startViewed(new  Date());
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("mira la pelicula");
		}
		System.out.println("\n");
		//termina de verla
		stopViewed(dateI, new Date());
		System.out.println("Leiste " + toString() + "\nDuracion: " + getTimeReaders() + "\n" );
	}
}
