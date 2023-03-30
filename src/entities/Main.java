package entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		SportTicket ticketDeporte = new SportTicket("campeonato barrial",LocalDateTime.now(),120,"FUTBOL","NACIONAL");
		SportTicket ticketDeporteB = new SportTicket("amistoso",LocalDateTime.now(),60,"RUGBY","INTERNACIONAL");
		
	}

}
