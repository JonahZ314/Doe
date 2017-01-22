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
	if (x == 2) {
	    return StoryLine2();
	}
	if (x == 3) {
	    return StoryLine3();
	}
	if (x == 4) {
	    return StoryLine4();
	}
	if (x == 5) {
	    return StoryLine5();
	}
	if (x == 6) {
	    return StoryLine6();
	}
	if (x == 7) {
	    return StoryLine7();
	}
	if (x == 8) {
	    return StoryLine8();
	}
	//player dies
	else return whisper;
    }

    public Clue StoryLine1() {
	System.out.println("\n------------------------------" +
			   "\nCHAPTER 4 - The Arnolds Investigation" + 
			   "\n\n\tArnolds is tense. Arnolds is quiet. Arnolds is, as always, polite." + 
			   "\n\t'That boy was a...nuisance, but he didn't, he didn't deserve that kind of ending.'"+
			   "\n\t'Did you know him well?'" +
			   "\n\t'He was a minor annoyance when he swung by, but beyond that, no.'" +
			   "\n\t'Ah.'" +
			   "\n\tI get nothing all afternoon. It's only when I leave the shop that I get something useful." +
			   "\n\t'Mr. Arnolds lies.'" +
			   "\n\t'I'm sorry?'" +
			   "\n\tThe kid looks into my eyes." +
			   "\n\t'He lies. On the tax papers. I have them. I do numbers, for practice. He lies.'" +
			   "\n\t'That's observant of you.' I have better things to do than investigate tax evasion." +
			   "\n\t'Mama says I'm very smart. I notice things. I notice that Mr. Felix gets cash from Mr. Arnolds every week.' That gets my attention." +
			   "\n\tFelix came every week, and always left five minutes later with an envelope. Maybe it wasn't money, but as a Pixie, what else would Felix take? Abandoned receipts? Felix was a blackmailer. Felix had helped Ms. Stevenson extort money from people. It's not a stretch to say that maybe Felix had something on Mr. Arnolds, too. Something Mr. Arnolds would pay to hide." +
			   "\n\tSomething Mr. Arnolds would lie about." +
			   "\n\t'Thank you...'" +
			   "\n\t'Nev Moore,' the kid slips me the tax papers and scrawled calculations before he goes to the store for a sweet." +
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
			   "\n\n\tI contact Ms. Stevenson. Felix had...coerced Ms. Yelnats into working for the Steel and Bricks architecture firm. She seems to be one of the few who hold a grudge rather than cower in fear of the Pixies." +
			   "\n\tShe also, according to Ms. Stevenson, argues more over design than anyone else. I have no idea why Ms. Stevenson has control over an architecture firm of all things, but if it gets me an interview with a potential suspect I'm not going to complain." +
			   "\n\tMs. Nikki Yelnats arches an eyebrow elegantly, and then glares at me suspiciously from her desk." +
			   "\n\t'Hello, Mx. Doe.'" +
			   "\n\tDid she hate Felix enough to kill?" +
			   "\n\t'I haven't seen or heard much of him in a while. I don't care about whatever he's involved in now.'" +
			   "\n\t'He's dead, Ms. Yelnats'" +
			   "\n\t'Oh. Oh, I--I didn't know.' She is concerned. She is startled. That's probably a good sign." +
			   "\n\tI talk to her about her recent whereabouts. She was in Main Street the night of the murder. She wanted to model one of the buildings she was designing and went to the general store to get supplies. She met Mr. Arnolds just before he closed up. She went home in the opposite direction of where the body was found. It's a long interview, and made longer by the fact that she rarely went to the town center, nearly always sticking to the outskirts." +
			   "\n\tOne of the interns, a large, burly woman by the name of Nim, brings us coffee, and cackles when I spit out the decaf. I clean up and leave without learning much else." +
			   "\n\tI have one more suspect--Arnolds." +
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
			   "\n2 : Go to the police station!" + 
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
