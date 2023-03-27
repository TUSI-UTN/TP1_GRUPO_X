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
	
	 private int age;
	 private boolean souvenir;

	public ChildrensEventTicket(String name, LocalDateTime dateTime, int minutes, int age, boolean souvenir) {
		super(name, dateTime, minutes);
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	@Override
	protected void calculateCost() {
		if(this.age < 8) {
			this.cost =  250;
		} else {
			this.cost = 500;
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
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public void setCategory(String category) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean hasSouvenir() {
        return souvenir;
    }
	
	public void setSouvenir(boolean souvenir) {
        this.souvenir = souvenir;
    }
	
	public int getAge() {
        return age;
    }

}
