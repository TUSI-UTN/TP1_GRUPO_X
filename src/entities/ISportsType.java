package entities;


public interface ISportsType{
	// enum donde almacenamos todas las posibles tipos de Deporte
	public enum SportsTypes {
		RUGBY,
		FUTBOL,
		HOCKEY
	};

	public SportsTypes getISportsType();
	public void setISportsType(String sportstype);
}
