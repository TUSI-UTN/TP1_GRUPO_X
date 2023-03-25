package entities;

import java.time.LocalDateTime;

/**
 * Las entradas de los eventos de deportes tienen un valor fijo según el tipo de deporte, el futbol tiene un valor fijo de 300$,
 * el rugby tiene un valor fijo de 450$ y hockey tiene un valor fijo de 380$. El deporte puede ser clasificado de manera nacional o internacional.
 * En el caso de que sea un deporte internacional, el valor de la entrada será con un recargo de un 30%.
 * 
 * @author tscutti
 *
 */
public class SportTicket extends Ticket implements ICategorizable {

	public SportTicket(String name, LocalDateTime dateTime, int minutes) {
		super(name, dateTime, minutes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categories getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCategory(String category) {
		// TODO Auto-generated method stub
		
	}

}
