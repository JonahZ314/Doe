public class StoryPart3 extends StoryPart {
	protected Clue body ;
	protected Clue video ;
	protected Clue memo ;
	
	public StoryPart3() {
	    super() ;
	    body = new Clue("Felix’s Corpse", "Stabbed and beaten. Brutal, whoever did this. The kid didn’t deserve this.") ;
	    video = new Clue( "Videotape", "Felix was here the day he went missing, but when? The videotape only has the date, not the time." );
	    memo = new Clue( "Yelnat's Memo" , "Stevenson isn't usually in this town. She's here for some kind of recruitment. She's been eyeing Alice. I don't like this." );
	}
    
    public Clue match( int x ) {
	if (x == 1) {
	    return StoryLine1();
	}
	if( x == 2 ) {
	    return StoryLine2() ;
	}
	if( x == 3 ) {
	    return StoryLine3() ;
	    }
	if( x == 4 ) {
	    return StoryLine4() ;
	}
	else {
	    return whisper;
	}
    }

    public Clue StoryLine1() {
	System.out.println( "\n\nThat was Dumb:" +
			    "\nYou have a new Clue!" +
			    "\n-------------------------------");
	return whisper;
    }
    public Clue StoryLine2() {
	System.out.println( "\n\nJail Trip:" +
			    "\nYou have a new Clue!" +
			    "\n-------------------------------" ) ;
	return body ;
    }
    
    public Clue StoryLine3() {
	System.out.println( "\n\nWe Need Answers:" +
			    "\nYou have a new Clue!" +
			    "\n-------------------------------" ) ;
	return video ;
    }
	
    public Clue StoryLine4() {
	System.out.println( "\n\nWho is She?:" +
			    "\nYou have a new Clue!" +
			    "\n-------------------------------" ) ;
	return memo ;
    }
}
