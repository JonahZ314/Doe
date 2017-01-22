public class StoryPart2 extends StoryPart {
    protected Clue letter;
    protected Clue receipt;
    protected Clue knife;
    public StoryPart2() {
	super();
	letter = new Clue("Letter from Caro", "Stevenson, I know you put a lotta trust in Mr. Casey, but I would much rather deal with someone else. He has taken a... liking to my husband, and it's making David quite uncomfortable.");
	receipt = new Clue("Notes on the Nature of Mankind", "Looks like Felix was keeping some dirt on Peter Arnolds -- poor man. Who's Nikki Yelnats, though?");
	knife = new Clue("Generic Knife, Bloody", "One on the generic knives that can be found at a general goods store. Doesn't have any fingerprints, unfortunatley.");
    }
    public Clue match(int x){
	if (x == 1) {
	    return StoryLine1();
	}
	else if (x == 2) {
	    return StoryLine2();
	}
	else if (x == 3) {
	    return StoryLine3();
	}
	else if (x == 4) {
	    return StoryLine4();
	}
	else {
	    return whisper;
	}
    }
    public Clue StoryLine1() {
	System.out.println("\n------------------------------" +
			   "\nCHAPTER 2 - Scratch Tavern" + 
			   "\n\n\tMrs. Caro calls Ms. Stevenson for me, to arrange a quick meeting. It's a short walk, at least. Stevenson greets me from the back of Scratch Tavern, a dingy old bar boasting a pool table and some dubious free mints. I sit, and buy a can of soda." +
			   "\n\t'Ms.Doe.'" + 
			   "\n\t'Ms. Stevenson. I heard that one of your employees went missing.'" +
			   "\n\t'Felix Casey, yes. What do you want to know?'" +
			   "\n\tIt takes me forever to get something out of her. I learn that Mr. Casey rose fast, in her gang. He is a quick opportunist. He likes to showboat his power. In a moment of weakness, she reveals that he is as much a pain in her side as he is an asset." +
			   "\n\tHe is also a flirt. He hits on her, his rival Harry Evans, Mrs. Caro's husband David, and also five leaders of other powerful gangs. He refuses to hit on his blackmail victims, though, and she appreciates that he has some sense in his head. She hands me a letter to prove how bad it is. Caro was sick of it to the point where she formally requested that he be replaced. I take the letter with me" +
			   "\n\tBy the time I get home, it's very dark. At the intersection I face a shortcut--shady as all-get-out--and the long way--only slightly longer but still damn shady. Ugh." +
			   "\n\nNew Clue: Letter from Caro" +
			   "\n\nChoices: " + 
			   "\n1 : Shortcut" +
			   "\n2 : Lamp-lit Street" +
			   "\n-------------------------------");
	return letter;
    }
    public Clue StoryLine2() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 2 - Little Alley in Diagon" +
			   "\n\n\tIt was well into the evening by the time I found Mr. Evans. Most of the time was spent wandering. I finally found him eating dinner outside a small alley." +
			   "\n\t'Evenin'" +
			   "\n\t'Good evening to you, too. Mr. Evans?'" +
			   "\n\t'That's me. Whaddya want a' dis hour? It's gettin' kinda late--shouldn't you goodie-two-shoes types be 'eadin' home?'" +
			   "\n\tI can't help the small chuckle that slips out. His accent is ridiculous. I clear my throat." +
			   "'Did you know Mr. Felix Casey?' Mr. Evans stares at me." + 
			   "\n\t'Yeah... Did somethin' 'appen to 'im? 'E was fine yesterday...'" + 
			   "\n\t'So you saw him yesterday?'" +
			   "\n\t'Yes I did--did somethin' 'appen? What? Where is 'e?'" +
			   "\n\tI tell Mr. Evans about Mr. Casey's disappearance and struggle to write down his reply. He knows that everyone knows about their rivalry, but apparently, it was not so antagonistic as people thought. Yes, they fought, but just to fight, and they always laughed it off later. He swears that he and Felix were friends, and gives me some of the blackmail notes that Mr. Casey had. The notes were on Peter Arnolds and a Miss Nikki Yelnats." +
			   "\n\t'It's dangerous this time of night. I'm walkin' you home.'" +
			   "\n\tHe does not care for my protests." +
			   "\n\nNew Clue: Notes on the Nature of Mankind" +
			   "\n\nChoices: " +
			   "\n3 : Arnolds" +
			   "\n4 : Yelnats" +
			   "\n-------------------------------");
	return receipt;
    }
    public Clue StoryLine3() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 2 - Attack on an Open Street!" +
			   "\n\n\tI grab the knife and run to the open street. I get a wack on the head anyway, but keep running. My vision starts to go black--no, no no no no. One corner, two--I lose track. Did I lose him? I run, and my legs burn for it. I turn to check if he's there. I sway. I fall." +
			   "\n\n\tI wake up. The room is softly lit, and it is morning. My head hurts." +
			   "\n\t'Hello, Mx? Are you quite alright?' I turn." +
			   "\n\tThere is a man in an apron. He looks worried. He's close enough that I can smell the flour on him. Is this a bakery?" +
			   "\n\t'Do you want some water?' I nod. He hands me a glass, and wrings his hands nervously. I drink." +
			   "\n\t'Can you tell me where I am?' I ask." +
			   "\n\t'Oh! Um. This is my bakery, Firebird Confections! I'm Declan Khaand. I found you collapsed outside last night. You were bleeding.'" +
			   "\n\tI reach up to my head, and my hand touches bandages." +
			   "\n\t'I know that this is a dangerous area, but, uh, do you mind telling me who you were running from?'" +
			   "\n\tI struggle to remember, and shake my head no." +
			   "\n\t'I found a corpse, I think? And then someone hit my head and...' I shrug." +
			   "\n\t'Do you want to stay here until things die down, Mx...?'" +
			   "\n\t'Doe, Jay Doe.'" +
			   "\n\nNew Clue: Generic knife, bloody" +
			   "\n\nChoices: " +
			   "\n5 : Investigate" +
			   "\n6 : Stay until things die down" +
			   "\n-------------------------------");
	return knife;
    }
    public Clue StoryLine4() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 2 - Dead End" +
			   "\n\n\tThe alley was such a bad idea. I can't remember where the turns lead. I run, and run... And hit a dead end. There's a fire escape, and I jump for it." +
			   "\n\tAnd I miss. And then the assailant is on top of me." +
			   "\n\n\tIt hurts. Dying hurts so, so much." +
			   "\n\tI want to find my parents first." +
			   "\n-------------------------------");
	return whisper;
    }
}
