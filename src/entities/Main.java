package entities;

import java.io.Console;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Genre Drama = new Genre ("Drama");
		
	    LocalDateTime dateTime = LocalDateTime.of(2022, Month.MAY, 1, 19, 30);
		TheaterTicket ticket = new TheaterTicket("obra1", dateTime, 120, Drama, 3);
		System.out.println(ticket.toString());
		}
}
