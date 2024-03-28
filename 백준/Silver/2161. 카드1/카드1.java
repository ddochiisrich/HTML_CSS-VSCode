import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int A = 0;
      
       List<Integer> numbers = new ArrayList<>();
       
       int N= sc.nextInt();
       for(int i=0; i<N; i++) {
          numbers.add(i+1);
       }
//       System.out.println(numbers.toString());

       int movedCard = 0;
       
       for(int i = 0; i < N-1; i++) {
          int C = numbers.remove(0);
          System.out.print(C+" ");
          
          movedCard = numbers.remove(0);
          numbers.add(movedCard);
          
//          System.out.println(numbers.toString());
          
          
       }
       System.out.print(numbers.get(0));
   }
}
