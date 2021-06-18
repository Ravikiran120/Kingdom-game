import java.util.*;

public class Kingdom {

 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    System.out.println("\nGuess the Queen's Room to save her:");
    int king = s.nextInt();
    int arr[][] = new int[a][a];
    int b=1, l=1;
    int len = String.valueOf(a*a).length();
    Random rand = new Random();
    int queen = rand.nextInt(a*a);
    
    System.out.println("\n"+ queen);

for (int i=0;i<a;i++){
       for(int j=0; j<a; j++){
         int ln = String.valueOf(b).length();
         System.out.print(("0".repeat(len-ln))+b+"  ");
         b++;
     }System.out.println("\n");
   }


if(queen==king){
System.out.println("\nYou saved her!!!");
}
else if(queen<king) {
System.out.println("\nyour queen is in the bottom floor");
}
else {
System.out.println("\nyour queen is in the top floor");
}

 }
}
