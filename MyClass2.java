/*Java program to find if the given number is prime or not.*/
import java.util.*;
public class MyClass2 {
   public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int c=0;
         for(int i=2;i<=n/2;i++)
            if(n%i==0)
                c++;
         if(c>0)
            System.out.println("not prime");
        else
            System.out.println("prime");
   }
}