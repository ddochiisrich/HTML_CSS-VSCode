import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int sum = 0;
		
		int [] num = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			num[i] = scan.nextInt();
		}
		
		int [] num2 = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			num2[i] = num[i]%42;
		}
		
		IntStream result = Arrays.stream(num2).distinct();

		int[] num3 = result.toArray();
		System.out.println(num3.length);
	}
}