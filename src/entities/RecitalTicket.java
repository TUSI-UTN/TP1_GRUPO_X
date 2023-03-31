package entities;

import java.time.LocalDateTime;

/**
 * Las entradas de los recitales tienen un costo de fijo 1500$ para entradas vip y 800$ para entradas generales. 
 * A su vez, cada entrada pertenece a una banda, tiene un g�nero en particular y puede tener una o dos bandas de soporte. 
 * Los g�neros posibles para los recitales son los siguientes: rock, heavy metal, reggaet�n, trap, latinos y pop.
 * 
 * @author tscutti
 *
 */
public class RecitalTicket extends Ticket implements ICategorizable{
	
	private ICategorizable.Categories category;
	private Band mainBand;
	private Band[] supportBands;
	private Genre genre;
	
	public RecitalTicket(String name, LocalDateTime dateTime, int minutes, String category, Genre genre, Band mainBand, Band[] supportBands) {
		super(name, dateTime, minutes);
		this.setCategory(category);
		this.setSupportBands(supportBands);
		this.calculateCost();
		this.mainBand = mainBand;
		this.genre = genre;
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
	protected void calculateCost() {
		if(ICategorizable.Categories.VIP == this.category) {
			this.cost = 1500;
			return;
		}
		this.cost = 800;
	}

	public void setSupportBands(Band[] bands) {
		if(bands.length > 2) {
			System.out.println("Un recital no puede tener mas de dos bandas soportes.");
			return;
		}
		
		this.supportBands = bands;
	}

	public Genre getGenre() {
		return this.genre;
	}
	
	@Override
	public String toString() {
		String recitalTicket = "Entrada de recital \n" + super.toString();
		recitalTicket += "Costo: " + this.cost + "\n";
		recitalTicket += "Categoria: " + this.getCategory() +  "\n";
		recitalTicket += "Banda principal: " + this.mainBand.getName() + "\n";
		recitalTicket += "Bandas soporte: \n";			
		
		for(Band band : this.supportBands)
		{
			recitalTicket += band.getName() + "\n";
		}
		
		return recitalTicket;
	}

}
