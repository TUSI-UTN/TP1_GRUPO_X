package entities;

import java.time.LocalDateTime;

import entities.Genre;


public class Main {

	public static void main(String[] args) {
		
		//Tickets Teatro
		System.out.println("\n--------------------------------------------------------------------------\n");
		System.out.println("TICKETS PARA TEATRO\n");
		
		Genre Drama = new Genre ("Drama");
        Actor actor1 = new Actor("Tom Hanks", 65, "Hombre");
        Actor actor2 = new Actor("Emma Watson", 31, "Mujer");
        Actor actor3 = new Actor("Robert De Niro", 78, "Hombre");

        Actor[] actors = { actor1, actor2, actor3 };

	    // Creamos una instancia de TheaterTicket 
        // que vamos a almacenar en un objeto de tipo Ticket
        Ticket theaterTicket = new TheaterTicket("The Lion King", LocalDateTime.now(), 120, Drama, 3, actors);
        System.out.println(theaterTicket.toString());
        
        System.out.println("\n--------------------------------------------------------------------------\n");
        
        //	Tickets Deportes
        System.out.println("TICKETS EVENTOS DE DEPORTES\n");
        //Futbol
        Ticket sportTicketFutbol = new SportTicket("Partido de Argentina vs Brazil", LocalDateTime.now(), 180, "FUTBOL", "INTERNACIONAL");
        System.out.println(sportTicketFutbol.toString());
        
        //Rugby
        Ticket sportTicketRugby = new SportTicket("Partido de Argentina vs Australia", LocalDateTime.now(), 90, "RUGBY", "INTERNACIONAL");
        System.out.println(sportTicketRugby.toString());
        
        //Hockey
        Ticket sportTicket = new SportTicket("Partido de Argentina vs Brazil", LocalDateTime.now(), 120, "HOCKEY", "NACIONAL");
        System.out.println(sportTicket.toString());
        
        System.out.println("\n--------------------------------------------------------------------------\n");
        
        //Tickets de Recitales
        System.out.println("TICKETS PARA RECITALES\n");
        
		Band banda1 = new Band("AC/DC", new Genre("Rock"));
		Band banda2 = new Band("Megadeth", new Genre("Heavy Metal"));
		Band banda3 = new Band("Jackboys", new Genre("Trap"));
		Band[] bandas = {banda2, banda3};
		
		Ticket recitalTicketVIP = new RecitalTicket("Vorterix Metal 2023", LocalDateTime.now(), 90, "VIP", new Genre("Rock"), banda1, bandas);
		System.out.println(recitalTicketVIP.toString());
		
		Ticket recitalTicketGeneral = new RecitalTicket("Masters Of Rock 2023", LocalDateTime.now(), 90, "GENERAL", new Genre("Rock"), banda1, bandas);
		System.out.println(recitalTicketGeneral.toString());
		
		System.out.println("\n--------------------------------------------------------------------------\n");
        
		//Tickets Eventos Infantiles
        System.out.println("TICKETS EVENTOS INFANTILES\n");
        
        Ticket childrensEventTicketMenor = new ChildrensEventTicket("Piñon Fijo", LocalDateTime.now(), "MENORES",60,true);
        System.out.println(childrensEventTicketMenor.toString());
        
        Ticket childrensEventTicketMayor = new ChildrensEventTicket("Piñon Fijo", LocalDateTime.now(), "MAYORES",60,false);
        System.out.println(childrensEventTicketMayor.toString());
	}

}
