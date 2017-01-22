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
			   "\n\n\tArnolds. Isn't this the second time his name came up? I know him--the friendly, if timid, owner of the general goods store. Would he be involved?" +
			   "\n\tI hope not, but my hopes have been dashed time and time again." +
			   "\n\t'Mr. Arnolds?'" +
			   "\n\t'Jay! How have you been?' He's cheerful today. He's had a rough week." +
			   "\n\t'Can I ask you some questions?'" +
			   "\n\tI hit dead end after dead end. Mr. Casey came to hassle him sometimes but was really only a nuisance. He came rarely, nowadays. Arnolds didn't talk to him much. Arnolds knew nothing about Mr. Casey's disappearance." +
			   "\n\tI leave. That was a waste of time--oh. Well." +
			   "\n\tThere's a videotape in the garbage, with the day before yesterday's date. Every instinct I have tells me to grab it, and I do. I practically run home to play it." +
			   "\n\tFelix Casey is thee. I can't tell when, but he's there, in the store. What does this mean?" +
			   "\n\tI'm about to play the video again when the phone rings." +
			   "\n\tIt's my friend Nick. He heard about my case." +
			   "\n\tHe's calling to tell me that they've found a body." +
			   "\n\tIt's Felix Casey's." +
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
			   "\n\n\tThe next morning, I call Nikki Yelnats to request an interview, and she suggests we meet at Firebird Confections. It turns out to be a quaint little bakery, with a good natured owner who greeted me when I stepped in." +
			   "\n\tA woman in the back raises a hand, the other holding a small cake. Chocolate." +
			   "\n\t'Mr. Doe?'" +
			   "\n\t'Yes, that would be me." +
			   "\n\tI sit down in front of her, 'Nice to meet you, Ms. Yelnats. I assume you know why I am here.'" +
			   "\n\tShe nods, 'What do you want to know?'" +
			   "\n\t'What was your relationship with Felix Casey?' She grimaces." +
			   "\n\t'I don't care much for the man.'" +
			   "\n\tI prod for nearly an hour before I get something solid. She's an architect, working for Stell and Bricks. She rather dislikes the, ahem, constraints of working there, as Ms. Stevenson has the boss in her pocket. However much Ms. Yelnats would like to leave, however, she can't." +
			   "\n\tMr. Casey makes sure of that." +
			   "\n\tHowever, she hasn't seen much of him as of late. He doesn't really care about her so long as she keeps working. The only person she has been seeing a lot of is, surprisingly, Ms. Stevenson herself. As the leader of one of the most powerful gangs in the state, her presence in such a small town is unusual. As far as Ms. Yelnats can tell, it's all part of some kind of recruitment effort. Ms. Stevenson wants to sink her claws high up, getting the more educated folks pulling favors for her." +
			   "\n\tShe seemed particularly interested in Alice Casey, who had made the most of her education." +
			   "\n\tBefore I leave, Yelnats hands me a memo. Stevenson thoughtfully provided a list of traits she wanted her new recruits to have. Namely, education and influence." +
			   "\n\tI get home at a decent hour, and plan to meet Peter Arnolds later. As I sit to rest, the phone rings." +
			   "\n\tIt's Nick, my friend in the precinct. He has heard about my latest case." +
			   "\n\t They found a body. It's Felix Casey's" +
			   "\n\nNew Clue: Yelnat's Memo" +
			   "\n\nChoices: " +
			   "\n1 : Go to the police station!"
			   "\n2 : Arnolds" +
			   "\n-------------------------------" ) ;
	return memo ;
    }
}
