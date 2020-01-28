/*   program to print * in Floyds format (using for and while loop)
#
# #
# # #
*/
import java.util.*;
public class MyClass7 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
