public abstract class StoryPart {
    protected Clue whisper;
    public StoryPart() {
	// Clue that will be returned if the player dies.
	whisper = new Clue("The whispers of the void", "Please, tell my sister, tell my sister I love her, tell my sister to grow up happy.");
    }
    public abstract Clue match( int num ) ;
}
