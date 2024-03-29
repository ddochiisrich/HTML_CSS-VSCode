import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] num = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			int A = scan.nextInt();
			int B = A%42;
			num[i] = B;
		}
		
		
		IntStream result = Arrays.stream(num).distinct();

		int[] num2 = result.toArray();
		System.out.println(num2.length);
	}
}
