package entities;

import java.time.LocalDateTime;

/**
 * Todas las entradas poseen un número único de entrada, nombre del show, día y horario del evento, tiempo aproximado de duración y costo. 
 * El costo se calcula de manera diferente según el tipo de entrada.
 * 
 * @author tscutti
 *
 */
public abstract class Ticket {
	public static int counter; 
	public int id;
	public String name;
	public LocalDateTime dateTime;
	public int minutes;
	
	/** 
	 * Metodo abstracto para calcular el costo de la entrada.
	 * @return
	 * 
	 * @author tscutti
	 */
	public abstract double calculateCost();
	public abstract String toString();
	
	public Ticket(String name, LocalDateTime dateTime, int minutes)
	{
		this.id = ++Ticket.counter; // First we increment 
		this.name = name;
		this.dateTime = dateTime;
		this.minutes = minutes;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public LocalDateTime getDateTime()
	{
		return this.dateTime;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	public int getId()
	{
		return this.id;
	}
}
