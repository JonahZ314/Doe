import cs1.Keyboard ;
import java.util.ArrayList ;

public class Woo {
	private ArrayList<Integer> checkPoints ;
	private ArrayList<Clue> Inventory ;
    
	public Woo() {
		checkPoints = new ArrayList<Integer>() ;
		Inventory = new ArrayList<Clue>() ;
    	}
	public void InventoryScroll() {
		int a = 0;
		for (int x = 0; x < Inventory.size(); x += 1) {
			System.out.println(x + " : " + Inventory.get(x));
		}
		System.out.println("Type in the number of the clue you want to read about.");
		System.out.println("When you're done, just type a number bigger than " + ( Inventory.size() - 1 ) + "." );
		while (a < Inventory.size()) {
			a = Keyboard.readInt() ; 
			System.out.println(Inventory.get(a).getDescription());
		}
	}
    
	public static void main( String[] args ) {
		Woo bob = new Woo() ;
		Clue clue = new Clue( "Uno" , "Hello." ) ;
		System.out.println( "Intro" ) ;
		System.out.println( "Type something to begin:" ) ;
		Keyboard.readString();
		bob.checkPoints.add( 0 ) ;
		System.out.println( bob.checkPoints ) ;
		bob.InventoryScroll() ; 
	//System.out.println("Yo! You did it!");
    	}
}
