package entities;

import java.time.LocalDateTime;

/**
 * Las entradas para el teatro tienen un valor fijo de 1350,50$. 
 * A su vez, los teatros tienen sus propios g�neros y actores principales.
 * Consideraremos que como m�ximo se puede tener 3 actores principales. 
 * Los g�neros de los teatros son los siguientes: drama, teatro o comedia.
 * @author tscutti
 *
 */
public class TheaterTicket extends Ticket {

	public TheaterTicket(String name, LocalDateTime dateTime, int minutes) {
		super(name, dateTime, minutes);
		// TODO Auto-generated constructor stub
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
