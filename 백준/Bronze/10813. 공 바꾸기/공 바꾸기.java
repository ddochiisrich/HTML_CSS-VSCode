import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		List<Integer> arr = new ArrayList<>();
			
		for( int k = 0 ; k < N ; k++ ) {
			arr.add(k+1);
		}
		
				for ( int f = 0 ; f < M ; f++){
					
					int i = scan.nextInt();
					int j = scan.nextInt();

				     Collections.swap(arr, i-1, j-1);
       
		}
		for ( int i = 0 ; i < N ; i++ ) {
			System.out.print(arr.get(i)+" ");
		}
	}
}
