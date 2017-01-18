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
	System.out.println("\n------------------------------" + 
			   "Chapter 1: Date at 38 Rose Street: Mrs. Irma Caro." +
			   "I opt to go to Mrs. Caro first. I don¡¯t know what Felix is like around the ladies -- perhaps he hit on her and pissed her off. It doesn¡¯t hurt to check. I am surprised to meet with her so quickly, but Ms. Casey has known her and called ahead. I have to take the train, for Rose Street, Mrs. Caro¡¯s favored meeting place, is on the other side of town. Mr. Casey had gone rarely. It is three hours before I arrive at the restaurant, just in time for lunch. Goldenheart¡¯s is classy, with tasteful paintings and carefully arranged bouquets, mostly roses. I go to the balcony.
¡°Hello, Mx. Doe. Or shall I call you Jay?¡±
¡°Just call me Doe, Mrs. Caro.¡± She does not request that I call her Irma.
¡°I heard that you were investigating Felix¡¯s disappearance.¡±
¡°I am. I don¡¯t suppose you¡¯d know anything?¡± Her expression turns serious.
¡°Mx. Doe, I suppose that you already suspect that Felix was on the shadier side of things. Let me tell you -- he most certainly was.¡±
Felix is not a door to door salesman. Felix works for one of the biggest gangs in the whole damn state. He is the Pixies¡¯ best blackmailer and the one who personally handles Ms. Stevenson¡¯s business. He is rumored to be the one to usurp her as boss. He is also a flirt, a cheat, a sneak, but his only saving grace seems to be how much he cared for his sister. Other than that, he is an ass that anyone might¡¯ve had a grudge against. He could have been kidnapped for blackmail. He could have been killed.
Mrs. Caro mentions he had something of a rival -- a Mr. Harry Evans. Felix is also last seen around Diagon District, heading to Main Street. Diagon District is generally acknowledged to be Mr. Evans¡¯s territory." +
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
			   "\n3 : Open Street!" +
			   "\n4 : Alley!" +
			   "\n-------------------------------");
	return cloth;
    }
}
