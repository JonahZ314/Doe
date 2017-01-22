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
			   "\nCHAPTER 1 - Date at 38 Rose Street" +
			   "\n\n\tI opt to go to Mrs. Caro first. I don't know what Felix is like around the ladies -- perhaps he hit on her and pissed her off. It doesn't hurt to check. I am surprised to meet with her so quickly, but Ms. Casey has known her and called ahead. I have to take the train, for Rose Street, Mrs. Caro's favored meeting place, is on the other side of town. Mr. Casey had gone rarely. It is three hours before I arrive at the restaurant, just in time for lunch. Goldenheart's is classy, with tasteful paintings and carefully arranged bouquets, mostly roses. I go to the balcony." + 
			   "\n\t'Hello, Mx. Doe. Or shall I call you Jay?'" + 
			   "\n\t'Just call me Doe, Mrs. Caro.' She does not request that I call her Irma." +
			   "\n\t'I heard that you were investigating Felix's disappearance.'" + 
			   "\n\t'I am. I don't suppose you'd know anything?' Her expression turns serious." +
			   "\n\t'Mx. Doe, I suppose that you already suspect that Felix was on the shadier side of things. Let me tell you -- he most certainly was.'" + 
			   "\n\tFelix is not a door to door salesman. Felix works for one of the biggest gangs in the whole damn state. He is the Pixies' best blackmailer and the one who personally handles Ms. Stevenson's business. He is rumored to be the one to usurp her as boss. He is also a flirt, a cheat, a sneak, but his only saving grace seems to be how much he cared for his sister. Other than that, he is an ass that anyone might've had a grudge against. He could have been kidnapped for blackmail. He could have been killed." + 
			   "\n\tMrs. Caro mentions he had something of a rival -- a Mr. Harry Evans. Felix is also last seen around Diagon District, heading to Main Street. Diagon District is generally acknowledged to be Mr. Evans's territory." +
			   "\n\nNew Clue: Caro's Gossip" + 
			   "\n\nChoices: " + 
			   "\n1 : Stevenson" +
			   "\n2 : Evans" +
			   "\n-------------------------------");
	return gossip;
    }
    public Clue StoryLine2(){
	System.out.println("\n-------------------------------" +
			   "\n\nCHAPTER 1 - Odds, Ends and General Goods" +
			   "\n\n\tArnolds is closer to the office than Caro, and anyways, it's not as though I could simply call her and arrange a meeting. I go to the general store, stopping by the donut shop at the corner for a snack. Peter Arnolds is big, but timid. He might actually be more nervous than the last time I saw him." +
			   "\n\t'Hello Jay,' he greets politely. 'What brings you here? Broke another door?'" + 
			   "\n\t'Business, actually. A man's gone missing. Felix Casey -- perhaps you know him?'"+
			   "\n\t'Casey?' He gulps. 'Now that...now that is a man you do not go looking for.'" + 
			   "\n\t'As far as I know he's a door to door salesman. What's the big deal?'" + 
			   "\n\t'Door to- A door to door salesman? No, Jay, no, that man, that man is no good. He's a Pixie!'" + 
			   "\n\tThe last part he whispered forcefully. A Pixie? The Pixies are a gang, the biggest in the state. This is dangerous." + 
			   "\n\t'Don't, listen here now, don't go looking. That man was blackmailing half the people in town, me, the stores next door, and probably the fishmonger! I don't know who'd kill him, but I don't want to meet them.'" + 
			   "\n\tI jot this down and leave. I wonder who else might be blackmailed. Perhaps I can ask Nick to ask around, he's always got an ear to the ground." +
			   "\n\tAs I go out, I notice a small scrap of cloth at the bottom of a bush. Litterers. I pick it up. It -- actually it looks like one of Mr. Casey's hand-carved buttons. I stash it. I take the shortcut home." + 
			   "\n\tThere is a corpse. I can see its face. It's Felix." + 
			   "\t\nThere is someone in a mask running towards me." +
			   "\n\nNew Clue: Ripped cloth" +
			   "\n\nChoices: " + 
			   "\n3 : Open Street!" +
			   "\n4 : Alley!" +
			   "\n-------------------------------");
	return cloth;
    }
}
