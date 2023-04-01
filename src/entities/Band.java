package entities;

public class Band {
    private String name;
    private Genre genre;

    Band(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName(){
        return this.name;
    }    

    public Genre getGenre() {
        return this.genre;
    }
}
