public class StoryPart0 extends StoryPart {

    protected Clue planner;

    public StoryPart0() {
	super();
	planner = new Clue("Planner", "Says 'Meet Caro' day before disappearence and 'Shake down customers' the day of. Weird.");
    }

    public Clue match(int x) {
	return StoryLine1();
    }

    public Clue StoryLine1() {
	System.out.print("\n\nPlaceholder." +
			 "\nYou have a new clue!" + 
			 "\n\nChoices: " +
			 "\n1 : Caro." +
			 "\n2 : Arnolds." +
			 "\n-------------------------------");
	return planner;
    }
}
