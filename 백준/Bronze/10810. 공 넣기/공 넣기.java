import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> arr = new ArrayList<>(N);
        
        for(int f = 0 ; f < N ; f++) {
        	arr.add(0);
        }
        
        int M = scan.nextInt();
        
        for( int a = 0 ; a < M ; a++) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();
            
            for(int b = i-1 ; b < j ; b++) { // 뒤 인덱스 값 빼기 앞인덱스값만큼 반복
            	arr.set(b, k);
            }

        }
        for(int i = 0 ; i < N ; i++) {
        System.out.print(arr.get(i)+" ");
        }
    }
}



