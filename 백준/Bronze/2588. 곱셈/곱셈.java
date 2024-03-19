import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(((B%100)/10)*A);
		System.out.println((B/100)*A);
		System.out.println(A*B);
		
	}
}
