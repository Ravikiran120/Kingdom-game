package kingdom;

public class LocateQueen {
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
