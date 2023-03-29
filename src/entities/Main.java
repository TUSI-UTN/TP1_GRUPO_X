package entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		//PRUEBA de creacion de ticket A deporte NACIONAL y ticket B deporte INTERNACIONAL 
		SportTicket ticketDeporte = new SportTicket("amistoso",LocalDateTime.now(),60,"FUTBOL","NACIONAL");
		SportTicket ticketDeporteB = new SportTicket("amistoso",LocalDateTime.now(),60,"RUGBY","INTERNACIONAL");
		
		//PRUEBA de creacion de ticket A con valores no contemplados
		//SportTicket ticketDeporteC = new SportTicket("amistoso",LocalDateTime.now(),60,"FOOTBALL","NAC");
	}

}
