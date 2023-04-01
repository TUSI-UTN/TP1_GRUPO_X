package entities;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Las entradas para el teatro tienen un valor fijo de 1350,50$.  A su vez, los teatros tienen sus propios generos y actores principales.
 * Consideraremos que como maximo se puede tener 3 actores principales. Los generos de los teatros son los siguientes: drama, teatro o comedia.
 */
public class TheaterTicket extends Ticket {
	
	private Genre genre;
	private Actor[] actors;
	//Costos Fijos por tipo Entrada
	private static final double fixedPrice = 1350.50;

	public TheaterTicket(String name, LocalDateTime dateTime, int minutes, Genre genre, int actoresPpales, Actor[] actors) {
		super(name, dateTime, minutes);
		this.setGenre(genre);
		this.setActors(actors);
	}

 	public TheaterTicket(String name, LocalDateTime dateTime, Genre genre, int actoresPpales, Actor[] actors) {
		super(name, dateTime);
		this.setGenre(genre);
		this.setActors(actors);
	}

	public void setActors(Actor[] actors) throws IllegalArgumentException {
		if(actors.length > 3) {
			throw new IllegalArgumentException("La cantidad de actores principales no puede ser mayor a 3");
		}

		this.actors = actors;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	protected void calculateCost() {
		this.cost = fixedPrice;	
	}

	public Actor[] getActors() {
		return this.actors; 
	}
	
	/*
	 * Agregar actores
	 */
	public void addActor(Actor actor) {
		if (this.actors == null) {
			this.actors = new Actor[1];
			this.actors[0] = actor;
		} else {
			Actor[] newActores = Arrays.copyOf(this.actors, this.actors.length + 1);
			newActores[newActores.length - 1] = actor;
			this.actors = newActores;
		}
	}
	
	/*
	 * Eliminar actores
	 */	
	public void removeActor(int index) {
		if (this.actors == null || index < 0 || index >= this.actors.length) {
			return;
		}
		Actor[] newActores = new Actor[this.actors.length - 1];
		System.arraycopy(this.actors, 0, newActores, 0, index);
		if (index < this.actors.length - 1) {
			System.arraycopy(this.actors, index + 1, newActores, index, this.actors.length - index - 1);
		}
		this.actors = newActores;
	}
	
	/*
	 * Mostrar actores
	 */	
	public void printActores() {
	    System.out.println("Actores:");
	    for (int i = 0; i < this.actors.length; i++) {
	        System.out.println("Actor " + (i+1) + ".");
	        System.out.println(this.actors[i].toString());
	    }
	}
	
	@Override
	public String toString() {
		String actorsString = "";
		for (int i = 0; i < this.actors.length; i++) {
		    actorsString += "\nActor " + (i + 1) + ".\n" + actors[i].toString();
		}
        return super.toString() + "\nGenero: " + this.getGenre().toString()+ "\nCantidad de Actores principales: " + this.actors.length + "\nActores: " + actorsString;
	}
}
