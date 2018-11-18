package co.miguelbravo.Amazonproyect.models;

import java.sql.Date;

public class Impreso {

	private String title;
	private Date editionDate;
	private String editorial;
	private String[] autors;
	
   

	public Impreso(String title, Date editionDate, String editorial, String[] autors) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editorial = editorial;
		this.autors = autors;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getEditionDate() {
		return editionDate;
	}


	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String[] getAutors() {
		return autors;
	}


	public void setAutors(String[] autors) {
		this.autors = autors;
	}



	
	
	
}
