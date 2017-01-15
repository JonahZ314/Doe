public class StoryPart2 extends StoryPart {
    protected Clue letter;
    protected Clue receipt;
    protected Clue knife;
    public StoryPart2() {
	super();
	letter = new Clue("Letter from Caro", "Stevenson, I know you put a lotta trust in Mr. Casey, but I would much rather deal with someone else. He has taken a... liking to my husband, and it's making David quite uncomfortable.");
	receipt = new Clue("Notes on the Nature of Mankind", "Looks like Felix was keeping some dirt on Peter Arnolds -- poor man. Who's Nikki Yelnats, though?");
	knife = new Clue("Generic Knife, Bloody", "One on the generic knives that can be found at a general goods store. Doesn't have any fingerprints, unfortunatley.");
    }
    public Clue match(int x){
	if (x == 1) {
	    return StoryLine1();
	}
	else if (x == 2) {
	    return StoryLine2();
	}
	else if (x == 3) {
	    return StoryLine3();
	}
	else if (x == 4) {
	    return StoryLine4();
	}
	else {
	    return whisper;
	}
    }
    public Clue StoryLine1() {
	System.out.println("\n\nScratch Tavern: Ms. Trixie Stevenson" +
			   "\nYou have a new Clue!" + 
			   "\n\nChoices: " + 
			   "\n1 : Shortcut" +
			   "\n2 : Lamp-lit Street" +
			   "\n-------------------------------");
	return letter;
    }
    public Clue StoryLine2() {
	System.out.println("\n\nA Little Alley in Diagon: Harry Evans" + 
			   "\nYou have a new Clue!" + 
			   "\n\nChoices: " + 
			   "\n3 : Arnolds" +
			   "\n4 : Yelnats" +
			   "\n-------------------------------");
	return receipt;
    }
    public Clue StoryLine3() {
	System.out.println("\n\nRun! Keeping Running: Attack on an Open Street!"+
			   "\nYou have a new Clue!" + 
			   "\n\nChoices: " + 
			   "\n5 : Investigate" +
			   "\n6 : Stay until things die down" +
			   "\n-------------------------------");
	return knife;
    }
    public Clue StoryLine4() {
	System.out.println("\n\nYou've met with a terrible fate, haven't you?" +
			   "\nDead End." +
			   "\n-------------------------------");
	return whisper;
    }
}
