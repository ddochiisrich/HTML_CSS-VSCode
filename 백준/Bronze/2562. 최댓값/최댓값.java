import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int [] arr = new int[9];
    	
    	int A = arr[0];
    	int B = 0;
    

    	for (int i = 0 ; i < arr.length ; i++) {
    		arr[i] = scan.nextInt();
    		if (A < arr[i]) {
    			A = arr[i];
    			B = i+1;
    		}
    	}

    	System.out.println(A);
    	System.out.println(B);
    }
}