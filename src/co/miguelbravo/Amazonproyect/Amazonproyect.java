package co.miguelbravo.Amazonproyect;
import co.miguelbravo.Amazonproyect.models.*;
import makeFile.Report;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Amazonproyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		showMenu();
	}
	
		
	public static void showMenu() {
		int exit =0;
		
		do {
			System.out.println("Bienvenidos al proyecto Amazon\n");
			System.out.println("selecciona la opcion que te guste. \n1. Peliculas\n2. Series\n3. Libros\n4. Revistas\n5. Reporte\n6. Reporte Diario \n0. Exit ");
			System.out.println("\n");
			System.out.println("Elige la opcion que desees: ");
			
			//leer_datos_consola
			Scanner entrada_Usuario = new Scanner(System.in);
			int respuesta = Integer.valueOf(entrada_Usuario.nextLine());
			
			switch (respuesta) {
			case 1: 
				showMovies();			
				break;
			case 2: 
				showSeries();		
				break;
			case 3:
				showBooks();			
				break;
			case 4: 
				showMagazines();		
				break;
			case 5: 
				makeReport();			
				break;
			case 6: 
				makeReport(new Date());			
				break;
			case 0: 
				exit = 0 ;
				System.out.println("Sales del programa");			
				break;
			default:
				System.out.println("elegiste una opcion no valida");
				
			}
		
		} while (exit != 0);

	
	}
	static ArrayList<Movies> movies;
	public static void showMovies() {
		int exit=1;
		movies = Movies.makeMovieslist();
		
		do {
			System.out.println("\n **Pelicula**\n");
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". "   + movies.get(i).getTitle() + "\nVisto. " + movies.get(i).isViewed()+ "\n");
			}
		System.out.println("0. para regresar\n");
		
		//leer_eleccion_usuario_peliculas
		Scanner sc = new Scanner(System.in);
		int response = sc.nextInt();
		
		if (response == 0) {
			showMenu();
		}
		
		
		if (response > 0 ) {
			//seleccionamos_opcion_de_pelicula_cambiamos_la_opcion_de_Visto
			Movies movieSelected = movies.get(response - 1);
			movieSelected.setViewed(true);
			
			//iniciamos_el_conteo
			Date dateI = movieSelected.startViewed(new Date());
			
			for (int i = 0; i < 100; i++) {
				System.out.println("mira la pelicula");
			}
			System.out.println("\n");
			

			//terminamos_verla
			movieSelected.stopViewed(dateI, new Date());
			System.out.println("Viste: " + movieSelected + "\nDuracion " + movieSelected.getTimeViewed()  );
			
		}
		
		
		
		
		
		} while (exit !=0);
	}
	
	
	public static void showBooks() {
		int exit=1;
		ArrayList<Books> libros = Books.makeBookslist();
				
		do {
			System.out.println("\n **Books** \n");
			
			for (int i = 0; i < libros.size(); i++) {
				System.out.println(i + 1 + ". "   + libros.get(i).getTitle() + " \nVisto. "  + libros.get(i).isReaders() +"\n"
				);
			}
			System.out.println("0. para regresar");
				//leer respuesta usuario
				
				Scanner sc = new Scanner(System.in);
				int response =sc.nextInt();
				if (response == 0) {
					showMenu();
				}
				
				//seleccionar el libro 
				Books librosSelected = libros.get(response-1);
				librosSelected.setReaders(true);
				
				Date dateI = librosSelected.startViewed(new  Date());
				
				for (int i = 0; i < 1000; i++) {
					System.out.println("mira la pelicula");
				}
				System.out.println("\n");
				//termina de verla
				librosSelected.stopViewed(dateI, new Date());
				System.out.println("Leiste " + librosSelected + "\nDuracion: " + librosSelected.getTimeReaders() + "\n" );
			
			
		} while (exit !=0);
	}
	
	public static void showSeries() {
		int exit=1;
		
		ArrayList<Series> series = Series.makeSerielist(); 
		
		do {
			System.out.println("\n **Series** \n");
			
		for (int i =0; i < series.size(); i++) {
			System.out.println((i + 1) + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed()
					);
		}
		System.out.println("0. Para regresar");
		
			//leer respuesta
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			if (response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapter());
			
		} while (exit !=0);
	}
	
	public static void showChapters(ArrayList<Chapters> capituloofSerieselected) {
		int exit=0;
		
		do {
			System.out.println("\n **Chapters** \n");
			
			for (int i = 0; i < capituloofSerieselected.size(); i++) {
				System.out.println(i+1 + " . " + capituloofSerieselected.get(i).getTitle() + " Visto: " + capituloofSerieselected.get(i).isViewed() );
			}
			
			//leer respuesta del usuario 
			Scanner sc = new Scanner(System.in);
			int response = sc.nextInt();
			
			if (response == 0 ) {
				showSeries();
			}
			Chapters chaptersSelected = capituloofSerieselected.get(response - 1);
			chaptersSelected.setViewed(true);
			
			for (int i = 0; i < 10000; i++) {
				System.out.println("mira la serie");
			}
			
			//inicia el conteo 
			Date dateI = chaptersSelected.startViewed(new Date());
			
			chaptersSelected.stopViewed(dateI, new Date());
			System.out.println("Viste "+ chaptersSelected.getTitle() + "\nDurante: " + chaptersSelected.getTimeViewed() +
			"\n"
			)  ;
			
		} while (exit !=0);
	}
	
	public static void showMagazines() {
		int exit=0;
		do {
			System.out.println("\n **Magazines** \n");
		} while (exit !=0);
}


		public static void makeReport() {
			
			Report report = new Report();
			
			report.setNameFile("reporte");
			report.setExtension("txt");
			report.setTitle("// visto //");
		    String  contentReport = "" ;
			
			for (Movies movies : movies) {
				if (movies.getIsViewed()) {
					contentReport  += movies.toString();
					
				}
			}
			report.setContent(contentReport);
			report.makeReport();
}
		
		public static void makeReport(Date date) {
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
			String dateString = df.format(date);
			
			
			Report report = new Report();
			
			report.setNameFile("reporte");
			report.setExtension("txt");
			report.setTitle("// visto //");
		    String  contentReport = "" ;
			
			for (Movies movies : movies) {
				if (movies.getIsViewed()) {
					contentReport  += movies.toString();
					
				}
			}
			report.setContent(contentReport);
			report.makeReport();
			
		}


}