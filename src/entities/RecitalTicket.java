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
	
	private ICategorizable.Categories category;
	
	public RecitalTicket(String name, LocalDateTime dateTime, int minutes, String category) {
		super(name, dateTime, minutes);
		this.setCategory(category);
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
	
	@Override
	public double calculateCost() {
		if(this.category == ICategorizable.Categories.VIP) {
			return 1500;
		}
		return 800;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}
