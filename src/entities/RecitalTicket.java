package entities;

import java.time.LocalDateTime;

/**
 * Las entradas de los recitales tienen un costo de fijo 1500$ para entradas vip y 800$ para entradas generales. 
 * A su vez, cada entrada pertenece a una banda, tiene un género en particular y puede tener una o dos bandas de soporte. 
 * Los géneros posibles para los recitales son los siguientes: rock, heavy metal, reggaetón, trap, latinos y pop.
 * 
 * @author tscutti
 *
 */
public class RecitalTicket extends Ticket implements ICategorizable{

	public RecitalTicket(String name, LocalDateTime dateTime, int minutes) {
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
