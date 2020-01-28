/*Java program to find if the given number is palindrome or not*/
import java.util.*;
public class MyClass3 {
   public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int c=0,a,p,b=0,c1=1;
         p=n;
         while(n!=0)
         {
             n=n/10;
             c1=c1*10;
         }
         n=p;
         while(n!=0)
         {
             c1=c1/10;
             a=n%10;
             b=b+a*c1;
             n=n/10;
             c++;
         }
        if(p==b)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
   }
}