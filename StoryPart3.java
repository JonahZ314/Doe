public class StoryPart3 extends StoryPart {
	// protected Clue ; // for storyLine 1 (death)
	protected Clue body ;
	
	public StoryPart3() {
		super() ;
		body = new Clue("Felix’s Corpse", "Stabbed and beaten. Brutal, whoever did this. The kid didn’t deserve this.") ;
	}
	
	public Clue match( int x ) {
		if( x == 2 ) {
			return StoryLine2() ;
		}
	}
	
	public Clue StoryLine2() {
		System.out.println( "\n\nJail Trip:" +
							"\nYou have a new Clue!" +
							"\n-------------------------------" ) ;
		return body ;
	}
	
}