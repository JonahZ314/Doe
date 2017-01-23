import cs1.Keyboard ;
import java.util.ArrayList ;

public class Woo {
    // both are ArrayLists so that elements can be added/removed
    private ArrayList<Integer> checkPoints ; // stores the player's choices
    private ArrayList<Clue> Inventory ; // stores Clues acquired throughout the game. Is based on player choices
    
    public Woo() {
		checkPoints = new ArrayList<Integer>() ;
		Inventory = new ArrayList<Clue>() ;
    }

    // Allows the player to go back to a certain point once he/she dies or finish the game. Incorporates junctures method.
    public void hindsight() {
	System.out.println( "You have reached an end. But you can go back! Which chapter would you like to go back to? If you would like to end the game, type -1." ) ;
	// user prompt asking for a chapter #. Range is [ 0 , 5 ]
	int a = Keyboard.readInt() ;
	// if the player enters something out of range, then the game stops entirely. 
	if( a < 0 || a > checkPoints.size() ) {
	    return ;
	}
	// removes a block of checkPoints and Inventory (which are of the same size). What's left behind are checkpoints and Clues corresponding to the chapter the user chose to go to 
	while( checkPoints.size() > a + 1 ) {
	    checkPoints.remove( checkPoints.size() - 1 ) ;
	    Inventory.remove( Inventory.size() - 1 ) ;
	}
	junctures( a + 1 ) ;
    }
	
    public void junctures(int x) {
	// the StoryLine that the player last chose
	int lastChoice = checkPoints.get(checkPoints.size()-1);
	StoryPart bob = new StoryPart0(); 
	if (x==1) {
	    bob = new StoryPart0();
	    Inventory.add(bob.match(lastChoice));
	}
	if (x==2) {
	    bob = new StoryPart1();
	    Inventory.add(bob.match(lastChoice));
	}
	if (x==3) {
	    bob = new StoryPart2();
	    Inventory.add(bob.match(lastChoice));
	}
	if (x==4) {
	    bob = new StoryPart3();
	    Inventory.add(bob.match(lastChoice));
	}
	if (x==5) {
	    bob = new StoryPart4();
	    Inventory.add(bob.match(lastChoice));
	}
	if (x==6) {
	    bob = new StoryPart5();
	    Inventory.add(bob.match(lastChoice));
	    this.chooseCulprit();
	    this.hindsight();
	    return;
	}
	// player dies, and is allowed to go back.
	if (Inventory.get(Inventory.size()-1).equals(bob.whisper)) {
	    this.hindsight();
	    return;
	} 
	while (checkPoints.size() <= x) {
	    System.out.println ("\nInput the number of the choice you choose, or 0 to check your Inventory.");
	    int input = Keyboard.readInt();
	    // player allowed to check Inventory if 0 is typed in and...
	    if (input == 0) {
		InventoryScroll();
	    }
	    // ... if not 0, a StoryLine choice was typed in. It will be added to checkPoints if it is within the range of choices. 
	    else {
		if (input==(lastChoice*2)||input==((lastChoice*2)-1)) {
		    this.checkPoints.add(input);
		}
	    }
	}
	junctures(this.checkPoints.size());
    }

    // the method allows the player to guess the murderer if he/she survives to the end.
    public void chooseCulprit() {
	System.out.println("\nThe time has come. Who is the murderer?" +
			   "\n1. Mrs. Irma Caro" +
			   "\n2. Mr. Peter Arnolds" +
			   "\n3. Ms. Trixie Stevenson" + 
			   "\n4. Mr. Harry Evans" + 
			   "\n5. Ms. Nikki Yelnats");
	System.out.println("\nType in the number of your choice or 0 to check inventory.");
	int a = Keyboard.readInt();
	if (a == 0) {
	    this.InventoryScroll();
	    this.chooseCulprit();
	}
	else if (a == 2) {
	    System.out.println("Congratulations Sherlock! You've solved the crime!"); 
	} else {
	    System.out.println("You point your finger in confidence, but unfortunately, you were mistaken. With your incorrect accusation, an innocent has been made to suffer unjust consequences." + "\nThe End");
	}
    }

    // the player can view the Inventory
    public void InventoryScroll() {
	int a = 0;
	System.out.println("");
	for (int x = 0; x < Inventory.size(); x += 1) {
	    System.out.println(( x + 1 ) + " : " + Inventory.get(x));
	}
	System.out.println("\nType in the number of the clue you want to read about.");
	System.out.println("When you're done, just type a number bigger than " + ( Inventory.size() ) + "." );
	
	a = Keyboard.readInt() ;
	// the Inventory can continued to be viewed as long as the player types in a number within the range of the numbers listed when the Inventory is printed out
	while (a <= Inventory.size() && a != 0 ) {
	    System.out.println(Inventory.get( a - 1 ).getDescription());
	    a = Keyboard.readInt() ; 
	}
    }
    
    public static void main( String[] args ) {
	Woo bob = new Woo() ;
	System.out.println( "Welcome to Choose Your Own Adventure: Murder Mystery." ) ;
	System.out.println( "Type something to begin:" ) ;
	Keyboard.readString();
	bob.checkPoints.add( 1 ) ;
	//System.out.println( bob.checkPoints ) ;
	//bob.InventoryScroll() ; 
	//System.out.println("Yo! You did it!");
	bob.junctures(bob.checkPoints.size()); // starts at (Chapter) 0. 
    }
}
