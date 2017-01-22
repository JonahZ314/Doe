public class StoryPart4 extends StoryPart {

    protected Clue taxes;
    protected Clue alibi;
    protected Clue liGossip;
    protected Clue schedule;
    protected Clue canvas;
    protected Clue arnoldGossip;
    protected Clue list;
    protected Clue evanGossip;

    public StoryPart4() {
	super();
	taxes = new Clue("Mr. Arnold's Taxes", "From what Nev calculated, there are hundreds missing from Mr. Arnold's accounts. Where is the money going? Did Felix get it?");
	alibi = new Clue("Yelnat's Whereabouts", "Yelnats was in the area at the time of the murder, apparently to pick up supplies to model her building.");
	liGossip = new Clue("Li's Gossip", "If this Mrs. Li can be trusted, a person of great stature dragged a large burden through Nocturne. Is this even relevant?");
	schedule = new Clue("Felix's Schedule", "Liked to hit up the stores at past closing time, at 9. Only the general goods store opens that late.");
	canvas = new Clue("Canvas", "There's a fabric shop that stocks canvas, plus the general store, crafts store, and the fishmonger who uses canvas bags to carry things. It probably came from a worn bag, anyway.");
	arnoldGossip = new Clue("Arnold's Gossip", "Arnolds says that Harry Evans had been hanging around late at night carrying a bundle to Nocturne.");
	list = new Clue("Felix's List", "It seems he was very prolific. Felix had dirt on almost everyone in the town, including Nikki Yelnats and Peter Arnolds.");
	evanGossip = new Clue("Evan's Gossip", "placeholder");
    }

    public Clue match(int x) {
	if (x == 1) {
	    return StoryLine1();
	}
	else if (x == 2) {
	    return StoryLine2();
	}
	//player dies
	else return whisper;
    }

    public Clue StoryLine1() {
	System.out.println("\n------------------------------" +
			   "\nCHAPTER 4 - The Arnolds Investigation:" + 
			   "\n\nAwaiting seal" + 
			   "\n\nNew Clue: Arnold's Taxes" +
			   "\n\nChoices: " + 
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Yelnats" +
			   "\n-------------------------------");
	return taxes;
    }

    public Clue StoryLine2() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Finding Yelnats" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Yelnat's Whereabouts" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Arnolds" + 
			   "\n-------------------------------");
	return alibi;
    }

    public Clue StoryLine3() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Tea For Three" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Li's Gossip" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Go to Police station" + 
			   "\n-------------------------------");
	return liGossip;
    }

    public Clue StoryLine4() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - The World is Always in Mourning" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Felix's Schedule" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Arnolds" + 
			   "\n-------------------------------");
	return schedule;
    }

    public Clue StoryLine5() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Confrontation at the Station" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Canvas" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Arnolds" + 
			   "\n-------------------------------");
	return canvas;
    }

     public Clue StoryLine6() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Skeletons in the Closet" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Arnold's Gossip" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Stevenson" + 
			   "\n-------------------------------");
	return arnoldGossip;
     }

    public Clue StoryLine7() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Instinctive Justice" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Felix's List" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Evans" + 
			   "\n-------------------------------");
	return list;
    }

    public Clue StoryLine8() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Life Crumbles into Ashes" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Evan's Gossip" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n2 : Go to Scratch Tavern" + 
			   "\n-------------------------------");
	return evanGossip;
    }

}
