public class StoryPart0 extends StoryPart {
    Clue planner = new Clue("Planner", "Says 'Meet Caro' day before disappearence and 'Shake down customers' the day of. Weird.");
    public Clue match(int x) {
	return StoryLine1();
    }
    public Clue StoryLine1() {
	System.out.print("Placeholder.");
	return planner;
    }
}
