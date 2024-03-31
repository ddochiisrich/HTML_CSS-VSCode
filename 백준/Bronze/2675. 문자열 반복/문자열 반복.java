import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       int T = scan.nextInt();
       
       for(int i = 0 ; i < T ; i++) {
    	   
           int R = scan.nextInt(); 
           String S = scan.next();
           
           for(int k = 0 ; k < S.length() ; k++) {
        	   for(int j = 0 ; j < R ; j++)
        	   System.out.print(S.charAt(k));

        	   
           }
    	   System.out.println();
       }       
    }
}
