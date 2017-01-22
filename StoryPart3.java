public class StoryPart3 extends StoryPart {
	protected Clue body ;
	protected Clue video ;
	protected Clue memo ;
	
	public StoryPart3() {
	    super() ;
	    body = new Clue("Felix's Corpse", "Stabbed and beaten. Brutal, whoever did this. The kid didn't deserve this.") ;
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
			   "\n\n\tThe shortcut is dark. I smell blood. I turn to leave and--" +
			   "\n\tWHACK" +
			   "\n\tEverything is gone" +
			   "\n\tEverything goes cold" + 
			   "\n-------------------------------");
	return whisper;
    }
    public Clue StoryLine2() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 3 - Jail Trip" +
			   "\n\n\tI get home safe and call Nick, tell him about the case. I look at my case file. I look at my clues." +
			   "\n\t'It'll be here in the morning.' I say, and go to bed, finally." +
			   "\n\tIt's there in the morning when Nick calls me." +
			   "\n\tThey found Felix Casey's corpse. And then found a possible suspect. I'm there in 20 minutes." +
			   "\n\tThe interrogation room is cold, and so is the shivering kid in cell. He's 23, they tell me. He looks too scrawny, too scared. This is Harry Evans? This is the kid who regularly fought a damn Pixie?" +
			   "\n\t'It was what we did! It was, it was...' He looks to be on the verge of tears." +
			   "\n\t'I know we fought, but we were just fightin' t'fight! I never wanted this! I... I...' He cries now." +
			   "\n\tEither the kid is really good at faking or he's a wreck. Apparently this kid was found just staring at the corpse. I have no idea why he got arrested. I need to look at the body. The sooner I solve this, I--oh. Oh. I need to tell Alice. Oh god." +
			   "\n\tI look at the body first. There's a stab wound but no knife. The rest of the body is pummeled, with most of the ribs broken and a good number of more fractured. Someone else did this." +
			   "\n\tSomeone strong, or with a lot of hired muscle. Caro? Stevenson? Who?" +
			   "\n\tI call Alice to tell her. It's not a nice conversation." +
			   "\n\tShe calls me back hours later. She has found the names of two people who seem to dislike to brother--Peter Arnolds and Nikki Yelnats." +
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
