public class StoryPart5 extends StoryPart {

    protected Clue gutFeeling;
    protected Clue missingKnife;
    protected Clue smellyKnife;
    protected Clue stevensonGossip;
    protected Clue oldLadyGossip;
    protected Clue acid;
    protected Clue report;
    protected Clue activities;

    public StoryPart5() {
	super(); 
	gutFeeling = new Clue("Gut Feeling", "Better hope that it's right.");
	missingKnife = new Clue("Yelnat's Missing Knife", "Why won't she talk about it? She seemed mad when I brought it up.");
	smellyKnife = new Clue("Smelly Knife", "Found it in the alley dumpster. Felix was definitely killed there. One of those generic ones that the general store stocks. Is rather disgusting.");
	stevensonGossip = new Clue("Stevenson's Gossip", "Felix was in charge of negotiating with the gangs in Nocturne, a district Ms. Caro wanted to add to her territory. Hmm...");
	oldLadyGossip = new Clue("Old Lady's Gossip", "Didn't catch her name, but she says that she spotted someone large carry what looked like a body from Main Street.");
	acid = new Clue("Acid on Rocks", "Felix Casey might have died here, in the shortcut much closer to the town center. Evans hadn't wanted to take the shortcut when he walked me home...");
	report = new Clue("Evan's Report on Everyone", "Everyone I met so far has had a bone to pick with Felix Casey, if Harry Evans is to be trusted. Ms. Yelnats is the latest one.");
	activities = new Clue("Felix's Activities", "Both Yelnats and Arnolds have motives and the ability. The three scoundrels seem to trust each other. This narrows things down considerably.");
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
	if (x == 9) {
	    return StoryLine9();
	}
	else return whisper;
    }

    public Clue StoryLine1() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - You Already Know, Don't You?" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Gut feeling" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return gutFeeling;
    }

    public Clue StoryLine2() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - We'll Meet Again Some Sunny Day" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Yelnat's Missing Knife" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return missingKnife;
    }

    public Clue StoryLine3() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - There Will Be Answers" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Smelly Knife" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return smellyKnife;
    }

    public Clue StoryLine4() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Reality Strike" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Stevenson's Gossip" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return stevensonGossip;
    }

    public Clue StoryLine5() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Home Visit" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Old Lady's Gossip" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return oldLadyGossip;
    }

    public Clue StoryLine6() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Shopping Trip" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Acid on the Rocks" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return acid;
    }

    public Clue StoryLine7() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Judgement" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Stevenson's Gossip" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return stevensonGossip;
    }

    public Clue StoryLine8() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Night Time Farewell" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Evan's Report on Everyone" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return report;
    }

    public Clue StoryLine9() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Table for Four" +
			   "\n\n\tinsert first line" +
			   "\n\tnext lines" +
			   "\n\nNew Clue: Felix's Activites" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return activities;
    }


}
