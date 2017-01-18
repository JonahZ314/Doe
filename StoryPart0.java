public class StoryPart0 extends StoryPart {

    protected Clue planner;

    public StoryPart0() {
	super();
	planner = new Clue("Planner", "Says 'Meet Caro' day before disappearance and 'Shake down customers -- don't forget Arnolds' the day of. Weird.");
    }

    public Clue match(int x) {
	return StoryLine1();
    }

    public Clue StoryLine1() {
	System.out.print("---------------------------------" +
			 "\nChapter 0:" +
			 "\nYounger Days " +
			"\n\nIt's a normal morning in the office when trouble waltzes in. Trouble is a decidedly little lady -- perhaps fourteen at most. Most of my clients are middle-aged wives who think their husbands are cheating on them." +
			 "\n'Why, hello there, little miss. What can I do for you?' Said little miss plops herself down on the seat." +
			 "\n'I am eighteen, Mx. Doe. I am no little miss.'" + 
			 "\nWell, isn't that something?" +
			 "\n'I want to hire you, Mx. Doe. I heard you did good work on the Pines case.'" +
			 "\n'You want me to find someone?' The Pines case was a complicated missing persons case that involved at least two cults, two sets of twins, and more encoded messages than I cared for." +
			 "\n'Yes. I am Alice Casey, and I want you to find my brother, Felix.'" +
			 "\nShe proceeds to talk about him at length. He is 23, tall, very finicky -- he carves his own buttons, handstitches his planners -- and works harder than anyone to put Ms. Casey through school. He's some kind of door to door salesman. Last night, he went missing, and Ms. Casey knew to call for help quick because he never comes home later than twelve -- rain, sleet or whatever hell was coming down." + 
			 "\n'I'll take the case,' I say, slowly, 'But I expect some kind of payment upfront.'" + 
			 "\n'I'll pay half now and half after you find him.' Ms. Casey hands me an envelope. I look inside." +
			 "\n'I'll be right on it, Miss.' Before she leaves, she gives me Mr. Casey's planner. There are only two names in the last few days, Caro and Arnolds. Caro is written on the day before Mr. Casey went missing, but her reputation as a cutthroat and rather shady businesswoman gives me pause. Arnolds, written in on the day Mr. Casey went missing, is the owner to the general goods shop on Main Street." +
			 "\n\nNew Clue: Mr. Casey's Planner" +
			 "\n\nChoices: " +
			 "\n1 : Caro." +
			 "\n2 : Arnolds." +
			 "\n-------------------------------");
	return planner;
    }
}
