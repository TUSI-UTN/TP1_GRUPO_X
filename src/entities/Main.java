package entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import entities.Genre;


public class Main {

	public static void main(String[] args) {
		
		Genre Drama = new Genre ("Drama");
        Actor actor1 = new Actor("Tom Hanks", 65, "Male");
        Actor actor2 = new Actor("Emma Watson", 31, "Female");
        Actor actor3 = new Actor("Robert De Niro", 78, "Male");

        Actor[] actors = { actor1, actor2, actor3 };

	    // Creamos una instancia de TheaterTicket
        TheaterTicket ticket = new TheaterTicket("The Lion King", LocalDateTime.now(), 120, Drama, 3, actors);
	    
        System.out.println("Agregando nuevo actor.");
        Actor nuevoActor = new Actor("Nuevo actor", 30, "Masculino"); 
        ticket.addActor(nuevoActor);
	    
        System.out.println("Mostrando actores por primera vez.");
	    ticket.printActores();
	    
	    System.out.println("Eliminando segundo actor.");
	    ticket.removeActor(1);
	    
	    System.out.println("Mostrando nuevamente los actores");
	    ticket.printActores();
	    
	    System.out.println("Detalles de la pelicula: \n" + ticket.toString());
	}
	


}
