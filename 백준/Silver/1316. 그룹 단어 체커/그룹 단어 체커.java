import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 입력할 단어의 수
        int R = N;
        
        for(int i = 0 ; i < N ; i++) {
        	String str = scan.next(); // 문자열 입력
        	boolean arr [] = new boolean[26]; // 알파벳 배열 만들기 (배열 초기값은 false)
        	
        	for(int j = 0 ; j < str.length()-1 ; j++) { // j와 j+1번째 배열을 비교하는 과정
        		if(str.charAt(j) != str.charAt(j+1)) { // j번째와 j+1번째가 다를경우
        			if(arr[str.charAt(j+1)-97] == true) {
        				R--;
        				break;
        			}
        		}
        		arr[str.charAt(j)-97] = true;
        	}
        }
        System.out.println(R);
    }
}