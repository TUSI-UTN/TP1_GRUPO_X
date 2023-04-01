package entities;

import java.time.LocalDateTime;

/**
 * Todas las entradas poseen un n�mero �nico de entrada, nombre del show, d�a y horario del evento, tiempo aproximado de duraci�n y costo. 
 * El costo se calcula de manera diferente seg�n el tipo de entrada.
 * 
 * @author tscutti
 *
 */
public abstract class Ticket {
	private static int counter; 
	protected int id;
	protected String name;
	protected LocalDateTime dateTime;
	protected int minutes = 90; // Duracion por defecto 
	protected double cost;
	
	/** 
	 * Metodo abstracto para calcular el costo de la entrada.
	 * @return
	 * 
	 * @author tscutti
	 */
	protected abstract void calculateCost();
	
	public Ticket(String name, LocalDateTime dateTime, int minutes)
	{
		this.id = ++Ticket.counter; // Primero incrementamos
		this.name = name;
		this.dateTime = dateTime;
		this.minutes = minutes;
	}
	
	/**
	 * Sobrecarga de constructor en caso de que no se sepa la duracion.
	 * La duracion por defecto sera de 90
	 * @param name
	 * @param dateTime
	 */
	public Ticket(String name, LocalDateTime dateTime)
	{
		this.id = ++Ticket.counter; // First we increment 
		this.name = name;
		this.dateTime = dateTime;
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
	
	public double getCost()
	{
		return this.cost;
	}
	
	public String toString() {
	    return "N�mero de entrada: " + getId() + "\nNombre del show: " + getName() + "\nFecha y hora del evento: " + getDateTime() + "\nDuraci�n aproximada: " + getMinutes() + " minutos\n"; 
	}
}
