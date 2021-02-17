import java.util.Scanner;

public class AddOrEven
{
	public static void main(String arg[])	
	{
              int n,sum=0;
                  
             Scanner sc=new Scanner(System.in);
 
	      System.out.println("Enter the numbers you want ");
              n=sc.nextInt();

               if (n%2==0) {
                    System.out.println("The given Number "+n+" is even");
               } else {
                   System.out.println("The given Number "+n+" is odd");
               }          
       }
}
