
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       
       int N = scan.nextInt();
       int M = scan.nextInt();
       
       int arr[] = new int[N];
       
       for(int i = 0 ; i < N ; i++) { // 배열만들기
    	   arr[i] = i+1;
       }
       
       for(int k = 0 ; k < M ; k++) { // 몇번 섞을지
    	   
           int i = scan.nextInt()-1; // 섞을 시작배열
           int j = scan.nextInt()-1; // 섞을 마지막배열
           
           while(i < j) {
        	   int temp = arr[i];
        	   arr[i++] = arr[j];
        	   arr[j--] = temp;
        	  
           }
    	   
       }
       for(int num : arr) {
    	   System.out.print(num+" ");
       }
    }
}
