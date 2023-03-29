package entities;

import java.time.LocalDateTime;

/**
 * Las entradas para el teatro tienen un valor fijo de 1350,50$.  A su vez, los teatros tienen sus propios generos y actores principales.
 * Consideraremos que como maximo se puede tener 3 actores principales. Los generos de los teatros son los siguientes: drama, teatro o comedia.
 */
public class TheaterTicket extends Ticket {
	
	private Genre genre;
	private int actoresPrincipales;

	public TheaterTicket(String name, LocalDateTime dateTime, int minutes, Genre genre, int actoresPpales) {
		super(name, dateTime, minutes);
		this.setGenre(genre);
		if(actoresPpales > 3)
		{
			System.out.println("La cantidad de actores principales no puede ser mayor a 3");
			this.actoresPrincipales = 0;
		}
		else 
		{
			this.actoresPrincipales = actoresPpales;
		}
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public int getActoresPpales () {
		return actoresPrincipales;
	}
	
	public void setActoresPrincipales (int actoresPpales) {
		this.actoresPrincipales = actoresPpales;
	}

	@Override
	protected void calculateCost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
	    return "Nombre: " + getName() + "\n" +
	           "Fecha y hora: " + getDateTime() + "\n" +
	           "Duración en minutos: " + getMinutes() + "\n" +
	           "Género: " + getGenre().getName() + "\n" +
	           "Actores principales: " + getActoresPpales();
	}
}
