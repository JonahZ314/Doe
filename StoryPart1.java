public class StoryPart1 extends StoryPart{
    protected Clue gossip;
    protected Clue cloth;
    public StoryPart1(){
	super();
	gossip = new Clue("Caro's gossip", "According to Caro, Felix was last seen around the Diagon District, heading to Main Street.");
	cloth = new Clue("Ripped cloth", "Ripped piece of cloth that seems to hold one of Felix's hand-carved buttons. Probably from a sleeve.");
    }
    public Clue match(int x) {
	if (x == 1){
	    return StoryLine1();
	}
	else if (x == 2) {
	    return StoryLine2();
	}
	else return whisper;
    }
    public Clue StoryLine1(){
	System.out.println("\n\nDate at 38 Rose Street: Mrs. Irma Caro." +
			   "\nYou have a new Clue!" + 
			   "\n\nChoices: " + 
			   "\n1 : Stevenson" +
			   "\n2 : Evans" +
			   "\n-------------------------------");
	return gossip;
    }
    public Clue StoryLine2(){
	System.out.println("\n\nOdds, Ends and General Goods: Mr. Peter Arnolds." +
			   "\nYou have a new Clue!" + 
			   "\n\nChoices: " + 
			   "\n1 : Open Street!" +
			   "\n2 : Alley!" +
			   "\n-------------------------------");
	return cloth;
    }
}
