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

	public int id;
	public String name;
	public LocalDateTime dateTime;
	public int minutes;
	public float cost;
	
	/** 
	 * Metodo abstracto para calcular el costo de la entrada.
	 * @return
	 * 
	 * @author tscutti
	 */
	public abstract int calculateCost();
	@Override
	public abstract String toString();
	
	public Ticket(String name, LocalDateTime dateTime, int minutes)
	{
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
	
	public float getCost()
	{
		return this.cost;
	}
}
