package kingdom;

import java.util.Random;

public class Bomb {
	void createBomb(int king) {
		Random rand = new Random();
	    int bomb = rand.nextInt(9);
	    System.out.println("\nBomb:"+bomb);
	    
	    
	    if(king==bomb) {
	    	System.out.println("\nBomb exploded");
	    	System.exit(0);
	    }
		
	}
	
}
