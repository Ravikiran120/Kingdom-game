import java.util.*;

class BaseStation {
	void createBase(int len, int a)
	{
		int b = 1;
		for (int i=0;i<a;i++){
	       for(int j=0; j<a; j++){
	         int ln = String.valueOf(b).length();
	         System.out.print(("0".repeat(len-ln))+b+"  ");
	         b++;
	     }System.out.println("\n");
	}
	}

}

class LocateQueen {
	void createLocate(int a, int queen, int king)
	{
		int n1 = king;
		int q1 = (queen%a);
		
		while((n1%a)!=0) {
			n1 =n1+1;
		}
		
		if(queen==king) {
			System.out.println("Queen is saved");
		}
		else if((queen<=n1) && (queen>(n1-a))) {
			System.out.println("Same");
			if((q1<=(Math.floorDiv(a,2))) && (q1!=0)) {
					System.out.println("Left");
		    }
		    else if (q1 == ((Math.floorDiv(a,2))+1)) {
		    		System.out.println("Middle");
	        }
	        else {
	        	System.out.println("Right");
	        }
		}

	    else if (queen<king) {
	    	System.out.println("Top");
	    	if(q1<=(Math.floorDiv(a,2)) && (q1!=0)) {
	    			System.out.println("Left");
	        }
	        else if (q1 == ((Math.floorDiv(a,2))+1)) {
	        		System.out.println("Middle");
	        }
	        else {
	        	System.out.println("Right");
	        }
	    }
	    
	    else {
	    	System.out.println("Bottom");
	    	if (q1<=(Math.floorDiv(a,2)) && (q1!=0)) {
	    			System.out.println("Left");
	        }
	        else if(q1==((Math.floorDiv(a,2))+1)) {
	        		System.out.println("Mid");
	        }
	        else {
	        	System.out.println("Right");
	        }
	     } 	

	}
}


class Final {


public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    System.out.println("\nGuess the Queen's Room to save her:");
	    int king = s.nextInt();
                      while(king==0 || (king>(a*a))) {   
                               System.out.println("\nEnter a valid input:");
                               king = s.nextInt();
	   }
                      int len = String.valueOf(a*a).length();
	    Random rand = new Random();
	    int queen = rand.nextInt(a*a);
	    
	    System.out.println("\n"+ queen);
		BaseStation base = new BaseStation();
	    base.createBase(len,a);
	    
	    LocateQueen loc = new LocateQueen();
	    loc.createLocate(a,queen,king);
}
}
