import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       
       int N = scan.nextInt();
       
       int [] arr = new int [N];
       
       for(int i = 0; i < N ; i++) {
    	   arr[i] = scan.nextInt();
       }
       
       Arrays.sort(arr);
       
       int M = arr[N-1];

       
       double sum = 0.0;
       
       for(int i = 0 ; i < N ; i++) {
    	   sum += ((double)arr[i]/M)*100;
       }
       
       System.out.println(sum/N);
    }
}
