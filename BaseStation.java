package kingdom;

public class BaseStation extends Increment{
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
