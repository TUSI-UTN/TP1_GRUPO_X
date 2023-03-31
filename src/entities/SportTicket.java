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


	@Override
	protected void calculateCost() {
		if(SportsTypes.RUGBY == this.getSportsType()) {
			this.cost =  450;
		} else if (SportsTypes.FUTBOL == this.getSportsType()){
			this.cost = 300;
		} else if (SportsTypes.HOCKEY == this.getSportsType()) {
			this.cost = 380;
		}
		else {
			System.out.println("Tipo de deporte Inexistente");
		}
		if(ICategorizable.Categories.INTERNACIONAL == this.getCategory()) {
			System.out.println("International ticket without tax  :" + this.getCost());
			System.out.println("International tax  :" + this.getCost()*0.3);
			this.cost = this.cost*1.3;
		}
		return;
	}

	@Override
	public String toString() {
		String sportsTicketInfo = "Entrada Evento deportivo \n" + super.toString();
		sportsTicketInfo += "Costo: " + this.cost;
		return sportsTicketInfo;
	}

	
	@Override
	public Categories getCategory() {
		// TODO Auto-generated method stub
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
			throw new IllegalArgumentException("Categoria " + category + " no disponible.");
		}	
	}
	
	public SportsTypes getSportsType() {
		return this.sportstype;
	}

}
