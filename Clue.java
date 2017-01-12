public class Clue {
    String name;
    String description;
    public Clue(String nom, String appearence) {
	name = nom;
	description = nom + ": " + appearence;
    }
    public String toString() {
	return name;
    }
    public String getDescription() {
	return description;
    }
}
