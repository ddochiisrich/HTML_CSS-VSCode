import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(-10000 <= A && -10000 <= B && A <= 10000 && B <= 10000) {
			
			if(A>B) {
				System.out.println(">");
			}else {
				if(A<B) {
					System.out.println("<");
				}else {
					System.out.println("==");
				}
			}
		}
	}
}
