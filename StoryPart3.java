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
	// player dies
	else {
	    return whisper;
	}
    }

    public Clue StoryLine1() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 3 - That Was Dumb" +
			   "\n\n\tAwaiting seal" +
			   "\n-------------------------------");
	return whisper;
    }
    public Clue StoryLine2() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 3 - Jail Trip" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Felix's Corpse" +
			   "\n\nChoices: " +
			   "\n1 : Arnolds" +
			   "\n2 : Yelnats" + 
			   "\n-------------------------------" ) ;
	return body ;
    }
    
    public Clue StoryLine3() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 3 - We Need Answers!" +
			   "\n\n\tAwaiting seal" +
			   "\n\nNew Clue: Videotape" +
			   "\n\nChoices: " +
			   "\n1 : Yelnats" +
			   "\n2 : Go to the police station!" + 
			   "\n-------------------------------" ) ;
	return video ;
    }
	
    public Clue StoryLine4() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 3 - Who is She?" +
			   "\n\nAwaiting seal" +
			   "\n\nNew Clue: Yelnat's Memo" +
			   "\n\nChoices: " +
			   "\n1 : Go to the police station!"
			   "\n2 : Arnolds" +
			   "\n-------------------------------" ) ;
	return memo ;
    }
}
