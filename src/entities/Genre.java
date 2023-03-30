package entities;

import java.time.LocalDateTime;

/* Clase genero
 * Los generos posibles para los recitales son los siguientes: rock, heavy metal, reggaeton, trap, latinos y pop.
 * Los generos de los teatros son los siguientes: drama, teatro o comedia.
 */

public class Genre {
	
	protected String name;
	
    public Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
