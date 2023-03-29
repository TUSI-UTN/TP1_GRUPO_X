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
public class SportTicket extends Ticket implements ICategorizable,ISportsType {

	private ICategorizable.Categories category;
	private ISportsType.SportsTypes sportstype;
	
	public SportTicket(String name, LocalDateTime dateTime, int minutes, String sportstype, String category) {
		super(name, dateTime, minutes);
		this.setISportsType(sportstype);
		this.setCategory(category);
		this.calculateCost();
		this.toString();
	}

	@Override
	protected void calculateCost() {
		if(ISportsType.SportsTypes.RUGBY == this.getISportsType()) {
			this.cost =  450;
		} else if (ISportsType.SportsTypes.FUTBOL == this.getISportsType()){
			this.cost = 300;
		} else if (ISportsType.SportsTypes.HOCKEY == this.getISportsType()) {
			this.cost = 380;
		}
		else {
			System.out.println("Tipo de deporte Inexistente");
		}
		if(ICategorizable.Categories.INTERNACIONAL == this.getCategory()) {
			this.cost = this.cost*1.3;
			System.out.println("International ticket tax  :" + this.getCost());
		}
		return;
	}

	@Override
	public String toString() {
		String sportsTicketInfo = "Entrada Evento deportivo \n" + super.toString();
		sportsTicketInfo += "Costo: " + this.cost;
		System.out.println(sportsTicketInfo);
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

	@Override
	public SportsTypes getISportsType() {
		// TODO Auto-generated method stub
		return this.sportstype;
	}

	@Override
	public void setISportsType(String sportstype) {
		try {
		this.sportstype = ISportsType.SportsTypes.valueOf(sportstype);
		} catch(IllegalArgumentException  ex) {
			throw new IllegalArgumentException("Categoria " + category + " no disponible.");
		}
	}

}
