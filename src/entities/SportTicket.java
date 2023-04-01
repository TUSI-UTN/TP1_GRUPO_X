package entities;

import java.time.LocalDateTime;

/**
 * Las entradas de los eventos de deportes tienen un valor fijo seg�n el tipo de deporte, el futbol tiene un valor fijo de 300$,
 * el rugby tiene un valor fijo de 450$ y hockey tiene un valor fijo de 380$. El deporte puede ser clasificado de manera nacional o internacional.
 * En el caso de que sea un deporte internacional, el valor de la entrada ser� con un recargo de un 30%.
 * 
 * @author tscutti
 *
 */
public class SportTicket extends Ticket implements ICategorizable {

	private ICategorizable.Categories category;
	public SportsTypes sportstype;
	
	//Costos Fijos por tipo Entrada
	private static final double rugby = 450;
	private static final double futbol = 300;
	private static final double hockey = 380;
	private static final double international = 1.3;//Recargo del 30% para deporte internacional.

	public enum SportsTypes {
		RUGBY,
		FUTBOL,
		HOCKEY
	};
	
	public SportTicket(String name, LocalDateTime dateTime, int minutes, String sportstype, String category) {
		super(name, dateTime, minutes);
		this.setSportsType(sportstype);
		this.setCategory(category);
		this.calculateCost();
		this.toString();
	}

	public SportTicket(String name, LocalDateTime dateTime, String sportstype, String category) {
		super(name, dateTime);
		this.setSportsType(sportstype);
		this.setCategory(category);
		this.calculateCost();
		this.toString();
	}

	@Override
	protected void calculateCost() {
		switch(this.getSportsType()) {
			case RUGBY:
				this.cost = rugby;
				break;
			case FUTBOL:
				this.cost = futbol;
				break;
			case HOCKEY:
				this.cost = hockey;
				break;
			default:
				System.out.println("Tipo de deporte Inexistente");
		}
		if(isInternational()) {
			//System.out.println("International ticket without tax  :" + this.getCost());
			//System.out.println("International tax  :" + this.getCost() * internacional);
			this.cost = this.cost * international;
		}
		return;
	}

	private boolean isInternational() {
		return ICategorizable.Categories.INTERNACIONAL == this.getCategory();
	}

	@Override
	public String toString() {
		String sportsTicketInfo = "Entrada Evento deportivo \n" + super.toString();
		sportsTicketInfo += "Categoria: " + this.getCategory() + "\n";
		sportsTicketInfo += "Deporte: " + this.getSportsType() + "\n";
		sportsTicketInfo += "Costo: " + this.cost;
		return sportsTicketInfo;
	}

	
	@Override
	public Categories getCategory() {
		return this.category;
	}

	@Override
	public void setCategory(String category) {
		try {
			this.category = ICategorizable.Categories.valueOf(category);
		} catch(IllegalArgumentException  ex) {
			throw new IllegalArgumentException("Categoria " + category + " no disponible.");
		}	
	}
	public void setSportsType(String sportstype) {
		try {
			this.sportstype = SportsTypes.valueOf(sportstype);
		} catch(IllegalArgumentException  ex) {
			throw new IllegalArgumentException("Deporte " + category + " no disponible.");
		}	
	}
	
	public SportsTypes getSportsType() {
		return this.sportstype;
	}

}
