package entities;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Las entradas para el teatro tienen un valor fijo de 1350,50$.  A su vez, los teatros tienen sus propios generos y actores principales.
 * Consideraremos que como maximo se puede tener 3 actores principales. Los generos de los teatros son los siguientes: drama, teatro o comedia.
 */
public class TheaterTicket extends Ticket {
	
	private Genre genre;
	private int actoresPrincipales;
	private Actor[] actores;
	//Costos Fijos por tipo Entrada
	private static final double costoFijo = 1350.50;

	public TheaterTicket(String name, LocalDateTime dateTime, int minutes, Genre genre, int actoresPpales, Actor[] actores) {
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
		
	    this.actores = actores;
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
		this.cost = costoFijo;	
	}

	public Actor[] getActores() {
		return actores;
	}

	public void setActores(Actor[] actores) {
		this.actores = actores;
	}
	
	/*
	 * Agregar actores
	 */
	public void addActor(Actor actor) {
		if (this.actores == null) {
			this.actores = new Actor[1];
			this.actores[0] = actor;
		} else {
			Actor[] newActores = Arrays.copyOf(this.actores, this.actores.length + 1);
			newActores[newActores.length - 1] = actor;
			this.actores = newActores;
		}
	}
	
	/*
	 * Eliminar actores
	 */	
	public void removeActor(int index) {
		if (this.actores == null || index < 0 || index >= this.actores.length) {
			return;
		}
		Actor[] newActores = new Actor[this.actores.length - 1];
		System.arraycopy(this.actores, 0, newActores, 0, index);
		if (index < this.actores.length - 1) {
			System.arraycopy(this.actores, index + 1, newActores, index, this.actores.length - index - 1);
		}
		this.actores = newActores;
	}
	
	/*
	 * Mostrar actores
	 */	
	public void printActores() {
	    System.out.println("Actores:");
	    for (int i = 0; i < actores.length; i++) {
	        System.out.println("Actor " + (i+1) + ".");
	        System.out.println(actores[i].toString());
	    }
	}
	
	@Override
	public String toString() {
		String actorsString = "";
		for (int i = 0; i < actores.length; i++) {
		    actorsString += "\nActor " + (i + 1) + ".\n" + actores[i].toString();
		}
        return super.toString() + "\nGenero: " + this.getGenre().toString()+ "\nCantidad de Actores principales: " + this.getActoresPpales()+ "\nActores: " + actorsString;
	}
}
