/*to find if the number entered is positive or negative. */
import java.util.*;
public class MyClass1 {
   public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n>=0)
            System.out.println("positive");
        else
            System.out.println("negative");
   }
}