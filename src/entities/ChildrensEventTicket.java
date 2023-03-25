package entities;

import java.time.LocalDateTime;

/**
 * Las entradas de los eventos infantiles tienen un costo fijo de 250$ para menores de 8 años y para mayores de 8 años el costo será de 500$. 
 * A su vez, los eventos infantiles pueden contener o no, un souvenir del evento.
 * 
 * @author tscutti
 *
 */
public class ChildrensEventTicket extends Ticket implements ICategorizable{

	public ChildrensEventTicket(String name, LocalDateTime dateTime, int minutes) {
		super(name, dateTime, minutes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Category getCategory() {	
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCategory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
