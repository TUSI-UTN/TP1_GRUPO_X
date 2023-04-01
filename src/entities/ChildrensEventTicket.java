package entities;

import java.time.LocalDateTime;

/**
 * Las entradas de los eventos infantiles tienen un costo fijo de 250$ para menores de 8 a�os y para mayores de 8 a�os el costo ser� de 500$. 
 * A su vez, los eventos infantiles pueden contener o no, un souvenir del evento.
 * 
 * @author tscutti
 *
 */
public class ChildrensEventTicket extends Ticket implements ICategorizable{
	
	 private boolean souvenir;
	 private ICategorizable.Categories category;

	public ChildrensEventTicket(String name, LocalDateTime dateTime, String category, int minutes, boolean souvenir) {
		super(name, dateTime, minutes);
		this.setCategory(category);
	}

	@Override
	protected void calculateCost() {
		if(ICategorizable.Categories.MAYORES == this.category) {
			this.cost =  500;
		} else if (ICategorizable.Categories.MENORES == this.category){
			this.cost = 250;
		} else {
			System.out.println("Categoria Inexistente");
		}
	}

	@Override
	public String toString() {
		String childrenTicketInfo = "Entrada Infantil \n" + super.toString();
		childrenTicketInfo += "Costo: " + this.cost + (hasSouvenir() ? "Incluye souvenir\n" : "No incluye souvenir\n");
		return childrenTicketInfo;
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
	
	public boolean hasSouvenir() {
        return souvenir;
    }
	
	public void setSouvenir(boolean souvenir) {
        this.souvenir = souvenir;
    }

}
