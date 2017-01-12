import cs1.Keyboard ;
import java.util.ArrayList ;

public class Woo {
    private ArrayList<Integer> checkPoints ;
    private ArrayList<Clue> Inventory ;
    
    public Woo() {
	checkPoints = new ArrayList<Integer>() ;
	Inventory = new ArrayList<Clue>() ;
    }
    
    public static void main( String[] args ) {
	Woo bob = new Woo() ;
	System.out.println( "Intro" ) ;
	System.out.println( "Type something to begin:" ) ;
	Keyboard.readString();
	System.out.println("Yo! You did it!");
    }
}
