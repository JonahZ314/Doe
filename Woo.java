import cs1.Keyboard ;
import java.util.ArrayList ;

public class Woo {
    private ArrayList<Integer> checkPoints ;
    private ArrayList<Clue> Inventory ;
    
    public Woo() {
		checkPoints = new ArrayList<Integer>() ;
		Inventory = new ArrayList<Clue>() ;
    }

	
    public void hindsight() {
		System.out.println( "You have reached an end. But you can go back! Which chapter would you like to go back to?" ) ;
		int a = Keyboard.readInt() ;
		while( checkPoints.size() > a ) {
			checkPoints.remove( checkPoints.size() - 1 ) ;
		}
		junctures( a ) ;
    }
	
    public void junctures(int x) {
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
	    this.chooseCulprit();
	    this.hindsight();
	    return;
	}
	if (Inventory.get(Inventory.size()-1).equals(bob.whisper)) {
	    this.hindsight();
	    return;
	} 
	while (checkPoints.size() <= x) {
	    System.out.println ("\nInput the number of the choice you choose, or 0 to check your Inventory.");
	    int input = Keyboard.readInt();
	    if (input == 0) {
		InventoryScroll();
	    } else {
		if (input==(lastChoice*2)||input==((lastChoice*2)-1)) {
		    this.checkPoints.add(input);
		}
	    }
	}
	System.out.println( checkPoints ) ;
	junctures(this.checkPoints.size());
    }

    public void chooseCulprit() {
	System.out.println("MOCK ENDING FOR DEMO VERS PURPOSES.");
	System.out.println("\nThe time has come. Who is the murderer?" +
			   "\n1. Mrs. Irma Caro" +
			   "\n2. Mr. Peter Arnolds" +
			   "\n3. Ms. Trixie Stevenson");
	System.out.println("\nType in the number of your choice or 0 to check inventory.");
	int a = Keyboard.readInt();
	if (a == 0) {
	    this.InventoryScroll();
	    this.chooseCulprit();
	}
	if (a == 2) {
	    System.out.println("Congratulations Sherlock! You've solved the crime!"); 
	} else {
	    System.out.println("You point your finger in confidence, but unfortunately, you were mistaken. With your incorrect accusation, an innocent has been made to suffer unjust consequences." + "\nThe End");
	}
    }

    public void InventoryScroll() {
		int a = 0;
		System.out.println("");
		for (int x = 0; x < Inventory.size(); x += 1) {
			System.out.println(( x + 1 ) + " : " + Inventory.get(x));
		}
		System.out.println("\nType in the number of the clue you want to read about.");
		System.out.println("When you're done, just type a number bigger than " + ( Inventory.size() ) + "." );
		
		a = Keyboard.readInt() ;
		while (a <= Inventory.size() && a != 0 ) {
			System.out.println(Inventory.get( a - 1 ).getDescription());
			a = Keyboard.readInt() ; 
		}
    }
    
    public static void main( String[] args ) {
		Woo bob = new Woo() ;
		//for Testing purposes:
		//Clue clue = new Clue( "Uno" , "Hello." ) ;
		//bob.Inventory.add( clue ) ;
		System.out.println( "Welcome to Choose Your Own Adventure: Murder Mystery." ) ;
		System.out.println( "Type something to begin:" ) ;
		Keyboard.readString();
		bob.checkPoints.add( 1 ) ;
		//System.out.println( bob.checkPoints ) ;
		//bob.InventoryScroll() ; 
		//System.out.println("Yo! You did it!");
		bob.junctures(bob.checkPoints.size());
    }
}
