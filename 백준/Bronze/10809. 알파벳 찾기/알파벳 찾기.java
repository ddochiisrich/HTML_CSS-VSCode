import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       
       int arr[] = new int[26];
       
       for(int i = 0 ; i < arr.length ; i++) {
    	   arr[i] = -1;
       }
       
       String S = scan.nextLine();
       
       for(int i = 0 ; i < S.length() ; i++) {
    	   char num = S.charAt(i);
    	   
    	   if(arr[num - 'a'] == -1) {
    		   arr[num - 'a'] = i;
    	   }
       }
       
       for(int result : arr) {
    	   System.out.print(result + " ");
       }
       
       
       
    }
}
