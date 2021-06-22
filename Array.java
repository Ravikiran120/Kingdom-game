package kingdom;
import java.util.*;

class Array{


public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = 3;
	    int len = String.valueOf(a*a).length();
	    int lv = 1;
	    
	    Story st = new Story();
	    st.createStory();
	    
		BaseStation base = new BaseStation();
	    base.createBase(len,a);
	   
	    System.out.println("\nGuess the Queen's Room to save her:");
	    int king = s.nextInt();
	    
	    while(king==0 || (king>(a*a))) {   
            System.out.println("\nEnter a valid input:");
            king = s.nextInt();
        }
	   
	     
	    Random rand = new Random();
	    int queen = rand.nextInt(a*a);
	    System.out.println("\n"+ queen);
	   
	    
	    LocateQueen loc = new LocateQueen();
	    loc.createLocate(a,queen,king);
	    

	    Bomb bom = new Bomb();
	    bom.createBomb(king);
	    
	    Increment in = new Increment();
	    in.lvincrement(lv);
	    in.aincrement(a);
}
}
