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
			   "\n\n\tI pause a moment." +
			   "\n\tMy heart seizes." +
			   "\n\tThere's a feeling in my gut, and realization hits me over the head." +
			   "\n\tI know I've just one chance to bring justice to the dead, but I'll make my choice and hope I don't regret it." +
			   "\n\tBecause otherwise... I'll never forget it." +
			   "\n\nNew Clue: Gut feeling" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return gutFeeling;
    }

    public Clue StoryLine2() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - We'll Meet Again Some Sunny Day" +
			   "\n\n\tI go to meet Ms. Yelnats. This is my last lead, and I want to find something, anything that could close this case. Stevenson gets me a meeting. I end up going to her apartment, in the middle of Nocturne. The district gives me the creeps." + 
			   "\n\tShe buzzes me in." +
			   "\n\tShe working on some kind of model, possibly of an apartment building." + 
			   "\n\t'So, Felix Casey is dead.'" + "I nod." + 
			   "\n\tWhat do you want to know?" +  
			   "\n\tShe was in the area they found the body the same night I investigated Mrs. Caro and Ms. Stevenson, but claims to not have seen anything. She was picking up modeling supplies from the general goods store. It was fast. The owner was a bit rude, trying to get her out despite still having a half hour until closing. He was very annoyed. After making her purchases she left, going in the exact opposite direction as the alley the body was found in. I don't get much else. I ask for some water, and she waves me into the kitchen. I get some water, but I notice that there is a knife missing from her set. I ask." + 
			   "\n\t'That doesn’t matter.'" + 
			   "\n\t'I was just curious--'" + 
			   "\n\t'It. Doesn’t. Matter. It broke, I threw it out, stop talking.'" + 
			   "\n\tShe refuses to talk further. I leave." +
			   "\n\nNew Clue: Yelnat's Missing Knife" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return missingKnife;
    }

    public Clue StoryLine3() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - There Will Be Answers" +
			   "\n\n\tWell, there’s just one person left to ask, isn’t there?" + 
			   "\n\tArnolds. The owner of the general goods store. I head over for a chat." + 
			   "\n\tHe is polite, as always, but tense. Possibly irritated, distracted. I want to know about Felix." + 
			   "\n\t'That boy was a... nuisance, but he didn’t, he didn’t deserve that kind of ending.'" + 
			   "\n\t'Did you know him well?'" + 
			   "\n\t'He was a minor annoyance when he swung by, but beyond that, no.' He doesn’t tell me anything useful." +
			   "\n\tIt’s late, I’m looking for some kind of sign of who could have done it, and I do something really stupid. I dig through trash. The body had a stab wound, so maybe the knife is somewhere nearby. I end up digging through the trashcans of three different stores and the dumpster in the alley where Feli was found. The last one had a knife, so I stow it and go home. It’s way, way too late for this. For me, at least -- some ruffians are starting to lurk near my home. I don’t care." + 
			   "\n\tI shower twice and go to sleep. The knife is placed on my desk." +
			   "\n\tI wake up still smelly and feeling so much regret, but I finally take a look at the knife. There’s a chunk of flesh in a chip on the blade. Otherwise, it seems wiped clean. I bring it to the police for testing." +
			   "\n\tIt’s human. I have my last clue." +
			   "\n\nNew Clue: Smelly Knife" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return smellyKnife;
    }

    public Clue StoryLine4() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Reality Strike" +
			   "\n\n\tI head over to the station. No point putting it off further." +
			   "\n\tI made a mob boss wait over an hour, apparently. Felix’s boss. Leader of the Pixies. She looks vaguely irritated." +
			   "\n\t'A pastry stop, Mx. Doe?' I bristle." +
			   "\n\t'I was checking up on a lead.' I am led to the coroner’s office, where Alice is. She sits, staring. She’s been staring for hours. The smell of acid makes my eyes water a bit." + 
				"\n\tFelix’s body is covered. The examination was finished. The body was possibly stabbed, possibly pummeled, and very likely dragged to Nocturne posthumously." + 
				"\n\t'I can give you Casey’s schedule, if that would help narrow things down." +
				"'Could you tell me anything about Nocturne instead?' She pauses." + 
				"\n\t'Why?'" + 
				"\n\t'Because someone decided that the middle of Nocturne, right out in the open, was a good place to dump a body.'" + 
				"\n\t'More violent, with my presence. I sent Casey there once or twice to negotiate with some of the smaller gangs there. Irma Caro was very interested in adding it to her territory, but Felix got her to compromise. Only recently, though.'" + 
				"Okay, then. Okay. Alice is still staring, barely blinking. Stevenson sits next to her." + 
				"\n\t'Tell me who it is first, Doe. I want to take that killer down myself.' She stares at the cloth-covered body." +
				"\n\t'No one hurts a Pixie and gets aways with it.'" + 
				"I leave them there." +
			   "\n\nNew Clue: Stevenson's Gossip" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return stevensonGossip;
    }

    public Clue StoryLine5() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Home Visit" +
			   "\n\n\tI track down Ms. Yelnat's number. She invites me to her apartment. I get there a bit early." +
				"\n\tShe looks haggard." + 
				"\n\t'Had to finish a building model with a colleague. Couldn’t get supplies earlier. Really tired, sorry.'" + 
				"\n\tThere isn’t much to talk about. She was being blackmailed, and she’s glad that Felix is gone now, but the very important visitor -- an.. ally of Stevenson, had kind of been push them to complete plans for a building. She’s pretty sure it’s meant for really illegal purposes -- as illegal as a building could get -- but doesn’t care enough. I should have gone to her before I went to the police station. She only pulled an all-nighter after then. I don't get much. I let her get some rest." + 
				"\n\tJust before I leave the building, an older woman stops me." + 
				"\n\t'You are a detective, yes?'" + 
				"\n\tI nod." + 
				"\n\t'I see a strange man late at night.' Um, okay?" + 
				"\n\t'He carry big package -- big like a body. And they found a body, yes?' I nod, paying more attention now." + 
				"\n\t'He a big man, very big, and very scary. He came from Main Street, I think. My children, they live in that direction. You keep them safe, yes?' I nod again." + 
				"\n\t'Thank you, ma’am.'" + 
				"\n\tI leave." +
			   "\n\nNew Clue: Old Lady's Gossip" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return oldLadyGossip;
    }

    public Clue StoryLine6() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Shopping Trip" +
			   "\n\n\tI’ve been avoiding this long enough. It’s time to visit Arnolds. I walk over to his store." + 
				"\n\t'Mr. Arnolds, how are you?'" +
				"\n\t'Well, and you?'" + 
				"\n\t'I’m investigating the death of Felix Casey. I don’t suppose you’d know about him?'" + 
				"\n\t'That boy was a... nuisance. I heard about how he died, though -- no one deserves that.'" + 
				"\n\t'Did you know him well?'" + 
				"\n\t'He was a minor annoyance when he swung by, but beyond that, no.'" + 
				"\n\t'Really? Because I’ve been asking around, and I’ve been told he has some dirt on you.' He stiffens. Further prodding reveals that he'd been giving Felix quite a bit of cash, much like the other shops on Main Street. I don’t get much else. I head home, taking a shortcut." +
				"\n\tI smell acid." + 
				"\n\tI see a stain in a corner of the alley." + 
				"\n\tWell." + 
				"\n\tThis is suspicious." + 
				"\n\tI take a sample." + 
				"\n\tIt smells like the coroner’s office." + 
				"\n\tIt smells like death." +
			   "\n\nNew Clue: Acid on the Rocks" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return acid;
    }

    public Clue StoryLine7() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Judgement" +
			   "\n\n\tI head over to the station. No point putting it off further." +
			   "\n\tI made a mob boss wait over an hour, apparently. Felix's boss. Leader of the Pixies. She looks vaguely irritated." +
			   "\n\t'A pastry stop, Mx. Doe?' I bristle." +
			   "\n\t'I was checking up on a lead.' I am led to the coroner’s office, where Alice is. She sits, staring. She’s been staring for hours. The smell of acid makes my eyes water a bit." + 
				"\n\tFelix’s body is covered. The examination was finished. The body was possibly stabbed, possibly pummeled, and very likely dragged to Nocturne posthumously." + 
				"\n\t'I can give you Casey’s schedule, if that would help narrow things down." +
				"'Could you tell me anything about Nocturne instead?' She pauses." + 
				"\n\t'Why?'" + 
				"\n\t'Because someone decided that the middle of Nocturne, right out in the open, was a good place to dump a body.'" + 
				"\n\t'More violent, with my presence. I sent Casey there once or twice to negotiate with some of the smaller gangs there. Irma Caro was very interested in adding it to her territory, but Felix got her to compromise. Only recently, though.'" + 
				"Okay, then. Okay. Alice is still staring, barely blinking. Stevenson sits next to her." + 
				"\n\t'Tell me who it is first, Doe. I want to take that killer down myself.' She stares at the cloth-covered body." +
				"\n\t'No one hurts a Pixie and gets aways with it.'" + 
				"I leave them there." +
			   "\n\nNew Clue: Stevenson's Gossip" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return stevensonGossip;
    }

    public Clue StoryLine8() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Night Time Farewell" +
			   "\n\n\tIt's late when I find Evans. He’s standing outside a debilitated building, fiddling with a knife and a bit of wood." + 
				"\n\t'Evenin'.'" + 
				"\n\t'Good evening to you, too. Mr. Evans?'" + 
				"\n\t'That’s me. Whaddya want a' dis hour? It's gettin' kinda late -- shouldn't you goodie-two-shoes types be 'eadin' home?' His accent is ridiculous, but I refrain from laughing." + 
				"\n\t'Are you Felix Casey's rival?" +
				"\n\t'Yeah -- whaddya want? I could chase 'im off if 'e's botherin' ya--'" + 
				"\n\t'He's dead, Mr. Evans.'" + 
				"\n\t'Whaddya mean--'" + 
				"\n\t'I was told you were his greatest rival.'" + 
				"\n\t'-- 'E's dead, 'e don't up and die, 'e can punch anyone's lights out, 'e--'" + 
				"\n\t'Mr. Evans.' He pauses. Sucks in breath. Looks up at me. 'I do not suspect you, but I was told you tended to keep track of his whereabouts?'" + 
				"\n\t'Yeah... Yeah, usually. 'E wasn't here for a few days, but sometimes he'll stay away a while when I get 'im good. We were fighting last time we met. Did, did he make it back?'" + 
				"\n\t'Three days ago?' He nods. 'No.' He jolts. Stares." + 
				"\n\tIt’s easy to get him to talk. Too easy -- I let him talk about anyone who might have wanted Felix Casey gone." + 
				"\n\tMrs. Caro, who was sick of Felix hitting on her husband, Mr. Arnolds who paid Felix hush money, Ms. Stevenson who trusted and distrusted Felix in turns and..." + 
				"\n\tMs. Yelnats. She'd been a promising young architect, heading to the big city for her wonderfully creative and useful designs. She'd never done anything to fight Felix, but she was a bit bitter, had a tendency for vengeance and a lot of contacts. She was new, too. Felix had known everyone else for years. I don’t know how to feel about this." +
			   "\n\nNew Clue: Evan's Report on Everyone" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return report;
    }

    public Clue StoryLine9() {
	System.out.println("\n-------------------------------" +
			   "\nCHAPTER 5 - Table for Four" +
			   "\n\n\tMr. Evans is only slightly red-eyed when we get to Scratch Tavern. He's tense. It's not exactly a good neighborhood after all. He tells me he lived here once, growing up." +
				"\n\t'Mx. Doe. Mr. Evans. What a pleasant surprise.'" + 
				"\n\t'Same, Ms. Stevenson, Mrs. Caro.' Two exceedingly dangerous women. Joy." + 
				"\n\t'We know Felix Casey went missing.'" + 
				"\n\t'Dead, actually.' Mrs. Stevenson narrows her eyes. I toss the knife onto the table." + 
				"\n\t'I came across the body but got attacked. I grabbed the knife and got away but the body was missing when the police got there. They're still investigating.'" + 
				"\n\t'Fine, then. We have some suspects in mind--'" + 
				"\n\t'I already told them 'bout Arnolds and Yelnats.' Mrs. Caro glares at Mr. Evans, who stares at her back. Ms. Stevenson is nonplussed." + 
				"\n\t'So we'll discuss motives. Let's trust that the killer is not among us.'" + 
				"\n\tThis leaves Arnolds and Yelnats." + 
				"\n\tOn one hand, Yelnats is a recent victim of blackmail, with plenty of contacts. Her co-workers are fond of her sarcasm. There has also been a lot of stress placed on her, with deadlines closing on fast. However, she seems to be giving it her all." + 
				"\n\tOn the other hand, Felix Casey had found more blackmail on Arnolds rather recently. Arnolds is strong enough to pull it off, certainly. But would he? He's a gentle, hardworking man, and Felix doesn’t seem to have upped the hush money much." + 
				"\n\tThen again, Felix liked to skim some profits off the top." + 
				"\n\tStevenson orders us something to eat. The only meals available are steak with fries and a vegetarian quiche. Still, surprisingly nice. Civil." + 
				"\n\tI have a suspect in mind." +
			   "\n\nNew Clue: Felix's Activites" +
			   "\n\nType any number to continue." +
			   "\n-------------------------------");
	return activities;
    }


}
