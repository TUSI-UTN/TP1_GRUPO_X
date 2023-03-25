package entities;

/**
 * Interfaz creada para implementar en las clases que necesiten ser categorizadas
 * @example
 * Las entradas de los recitales tienen un costo de fijo 1500$ para entradas vip y 800$ para entradas generales.
 * Las entradas de los eventos infantiles tienen un costo fijo de 250$ para menores de 8 años y para mayores de 8 años el costo será de 500$.
 * El deporte puede ser clasificado de manera nacional o internacional.
 * 
 * @author tscutti
 *
 */
public interface ICategorizable{
	
	public Category getCategory();
	public void setCategory();
}
