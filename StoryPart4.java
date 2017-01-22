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
	list = new Clue("Felix's List", "Felix had dirt on almost everyone in the town, including Nikki Yelnats and Peter Arnolds.");
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
			   "\n3 : Arnolds" + 
			   "\n-------------------------------");
	return alibi;
    }

    public Clue StoryLine3() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Tea For Three" +
			   "\n\n\tI need to find Yelnats first. According to Mr. Evans, Felix had to blackmail her into staying at the Steel and Bricks architecture firm. For all I know she'll skip town as soon as she hears that Felix died. Evans tags along. He's a bit jittery about the part of town she agreed to meet up in." +
			   "\n\tNocturne, despite only being a few blocks past the other side of the town square, is more violent than Diagon." +
			   "\n\tFirebird Confections is owned by Ms. Yelnat's cousins, and she trusts in its relative security." +
			   "\n\t'Mx. Doe. Miser...?'" +
			   "\n\t'Call me Harry.'" +
			   "\n\tShe raises a brow, elegantly. I cut to the chase." +
			   "\n\t'Where were you on the night Felix Casey was killed?'" +
			   "\n\t'Home, in my apartment a block over.' She was supposed to pick up modeling supplies at the general good store, but her friend in Steel and Bricks called her from going to Main Street. This friend, Day Sova, had noticed a known ruffian in the area." +
			   "\n\tMr. Evans bristled." +
			   "\n\tThe last thing she mentions is some of her neighbor's gossip--Mrs. Li kept odd hours, and had mentioned spotting a large person dragging a person-sized bag. Some brute, Mrs. Li swore." +
			   "\n\tMost people thought Mrs. Li tended to exaggerate." +
			   "\n\tThe meeting ends. Ms. Yelnats needs to get back to her job." +
			   "\n\tI head to the police station, and Mr. Evans bid me farewell." +
			   "\n\nNew Clue: Li's Gossip" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n4 : Go to the police station!" + 
			   "\n-------------------------------");
	return liGossip;
    }

    public Clue StoryLine4() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - The World is Always in Mourning" +
			   "\n\n\tI get to the police station as soon as I can. Alice is there already--she was the one to confirm the body." +
			   "\n\tOr what's left of it." +
			   "\n\tFelix Casey's corpse had been thoroughly doused in acid. The mortician thinks that it may have been dragged posthumously to where they'd found it, dead center of Nocturne District. Beyond taht they can't tell much--he was possibly stabbed, but he also may have been beaten to death. There's not enough left." +
			   "\n\tMs. Stevenson pulls me over to an abandoned corner. How a mob boss managed to not get arrested in a police station, I will never know." +
			   "\n\t'I need to ask you something, and I will give you as much info on Casey as you want in exchange.'" +
			   "\n\tShe wants to be the first one to the murderer. She wants to find out before Alice, before the police. She wants the killer in pain and destroyed and so very dead. Felix was a Pixie. They protected their own." +
			   "\n\tShe can't give me much that I don't already know. The only thing she can give me is the Felix's typical schedule. He liked to hit up the stores on Main street for money, and come to her as soon as he finished or the next day. He never came by that night, or the next day, and now she knows to stop waiting. She scrawls a summary and leaves. She has work to do." +
			   "\n\nNew Clue: Felix's Schedule" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n5 : Yelnats" + 
			   "\n-------------------------------");
	return schedule;
    }

    public Clue StoryLine5() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Confrontation at the Station" +
			   "\n\n\tI end up calling Ms. Yelnats before I head to the station. Nick mentioned that the body was found in Nocturne. Ms. Yelnats is startingly popular despite her bitterness. Perhaps she can help me find someone who saw something." +
			   "\n\tI get to the police station and find Ms. yelnats staring down at a shorter woman with a strong resemblance to Ms. Stevenson in the pictures the police have. Two seconds in, I realize that Ms. Yelnats is in fact staring down the mob boss behind her boss, and resist the urge to leave immediately." +
			   "\n\t'Ms. Yelnats. Ms. Stevenson.' They are startled. Ms. Stevenson looks like she wants to say something. Ms. Yelnats looks slightly embarrassed. Ms. stevenson clears her throat anad pulls on my sleeve." +
			   "\n\t'Alice is with... the body.' I am led to the coroner's office. The smell of acid is nauseating." +
			   "\n\tAlice sits, staring at what is left of her brother. Ms. Stevenson is uncomfortable. Ms. Yelnats is disturbingly curious about the body. Tere's so little left, between the acid, what may be stabs and massive bruising, and an entire section that looks scraped semi-clean. Nick had filled me in. He couldn't be here now because some intern gave someone very important food poisoning." +
			   "\n\tSteel and Bricks--Yelnats had rolled her eyes." +
			   "\n\tMs. Stevenson looks like she wants to say something again. She doesn't." +
			   "\n\t'Stop.' Yelnats is much too close to the body. The quiet mortician swats at her, startling me." +
			   "\n\t'There's some kind of material at the edges of the scrape. It looks like canvas.' That doesn't narrow things down much, but I appreciate the info." +
			   "\n\tAlice is still silent." +
			   "\n\nNew Clue: Canvas" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n6 : Arnolds" + 
			   "\n-------------------------------");
	return canvas;
    }

     public Clue StoryLine6() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Skeletons in the Closet" +
			   "\n\n\tIt is almost 7 p'clock when I step into the local general goods store." +
			   "\n\t'It's nice to see you, Jay.' Peter Arnolds looks up from behind the counter." +
			   "\n\t'Likewise,' I say." +
			   "\n\tHe stands up, smiling amicably as he dusts his hands off on his pants. 'We're five minutes to closing today, but what can I do for you?'" +  
			   "\n\tThere's no point in dawdling; I cut to the chase. 'Felix Casey. Does that ring a bell?'" +
			   "\n\tI watch as Arnolds visibly tenses. His face elapses into fear, struggling to maintain its composure. He glances at the clock nervously. Strange." +
			   "\n\t'What about Mr. Casey?' He mumbles, finally." +
			   "\n\tI tread lightly, 'Felix Casey was blackmailing several people; I believe you are one of them.'" +
			   "\n\tArnolds hesitates, 'Perhaps I was.'" +
			   "\n\t'And what kind of information exactly did he have?'" +
			   "\n\t'Look Jay,' he frowns. 'I would love to help you with your investigation, but I can't, really. I can't tell you.' He looks at me and signs, 'I gave him money, that's all.'" +
			   "\n\tHe won't talk more about the blackmail. I ask him if he noticed anything odd recently. He nervously menetions Harry Evans. Mr. Evans had been around Main Street, recently. He'd been over a lot." +
			   "\n\tMr. Arnolds says he saw someone, hours after Harry Evans walked me home, take ea large bundle in the direction of Nocturne. He is... suspicious. I am, too." +
			   "\n\nNew Clue: Arnold's Gossip" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n7 : Stevenson" + 
			   "\n-------------------------------");
	return arnoldGossip;
     }

    public Clue StoryLine7() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Instinctive Justice" +
			   "\n\n\t'Mx. Doe.' The voice on the phone was cold." +
			   "\n\t'Ms. Stevenson?'" +
			   "\n\t'I'll be waiting for you at Scratch Tavern. Be there by eight PM.'" +
			   "\n\tScratch Tavern is quite possibly the most suspicious bar in a fifty mile radius. My friend Nick tells me that its monthly pool tournament may be the only thing keeping it afloat. I wait nervously in my room. She called first. What does she want?" +
			   "\n\tI find Ms. Stevenson in conversation with a woman who introduces herself as Mrs. Irma Caro." +
			   "\n\tI don't ask." +
			   "\n\t'What is your latest on Casey?' Ms. Stevenson asks. 'I am... concerned. He was one of my best.'" +
			   "\n\t'I'm sorry to say that we--I've found his corpse a day ago near Main Street.' I reach in my bag and pull out a dulled knife. 'This was, um, in him.'" +
			   "\n\t'On Main Street?' Ms. Caro arches an eyebrow, running a finger down the blade. 'I wonder who dares...'" +
			   "\n\tMs. Stevenson contemplates for a moment, before placing a list onto the table. It's a list of those whom Felix Casey had been blackmailing. In exchange, she wants first dibs to the killer. I reluctantly agree." +
			   "\n\t'We'll show him what happens when you meddle.' Ms. caro eyes the blad again." +
			   "\n\tI leave the two women. I have never known what tranquil fury meant before, but now that I do, I don't want to see it in action." +
			   "\n\nNew Clue: Felix's List" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n8 : Evans" + 
			   "\n-------------------------------");
	return list;
    }

    public Clue StoryLine8() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 4 - Life Crumbles into Ashes" +
			   "\n\n\t'Mx. Doe.' The voice on the phone was cold." +
			   "\n\t'Ms. Stevenson?'" +
			   "\n\t'I'll be waiting for you at Scratch Tavern. Be there at by eight PM." +
			   "\n\tWell. I already resolved to investigate Mr. Evans, so I'll do that in the meantime. Not trying to distract myself from the mob boss. No. Not at all, that's ridiculous." +
			   "\n\tI find Mr. Evans hanging around a park." +
			   "\n\t'Good afternoon, Mr. Evans. I have some questions I need to ask you.'" +
			   "\n\t'Why? What'd I do?'" +
			   "\n\t'Nothing I know of, I just need to know what happened to Felix Casey a few days ago.' He frowned." +
			   "\n\t'We got into a fight an' 'e went 'ome, like always.'" +
			   "\n\t'I do not believe he made it home.' Mr. Evans looked concerned." +
			   "\n\t'Is 'e hurt? What's goin' on?' Time to be blunt, then." +
			   "\n\t'He's dead, Mr. Evans.'" +
			   "\n\t'No.' What? 'No, that ain't possible.'" +
			   "\n\t'I saw his body my--'" +
			   "\n\tMr. Evans interjects, 'No, no, no--Felix always gets back up, Felix always throws the last punch, 'e, he, he's always...' He calms." +
			   "\n\t'How do you know?' I pull out the knife. He startles, but I talk quickly." +
			   "\n\t'I found the body in an alley butsomeonetriedtokillme and then I ran and the body is gone now.'" +
			   "\n\tHe stares at the knife. I sweat." +
			   "\n\t'If it, if it t'would 'elp, I could tell ya 'bout the people 'e's got blackmail on. Arnolds and Yelnats--" +
			   "\n\t'I've met both.' He swallows." +
			   "\n\t'Oh. Um. 'Sides that I could tell ya 'bout the fights goin' on in Nocturne? Felix never turned one down, and everyone in Nocturne's itching for one.'" +
			   "\n\t'Why?'" +
			   "\n\t'Trixie Stevenson. She's a mob boss, Felix's, but she rarely comes 'ere. Everyone's antsy.'" +
			   "\n\tI leave. He comes with. He refuses to acknowledge that he is crying." +
			   "\n\tWell. At least I won't be alone with Stevenson." +
			   "\n\nNew Clue: Evan's Gossip" +
			   "\n\nChoices: " +
			   "\n1 : You have a hunch? Skip the last suspect and make your guess!" +
			   "\n9 : Go to Scratch Tavern" + 
			   "\n-------------------------------");
	return evanGossip;
    }

}
