package string;

import java.util.Scanner;

public class HALFSTR 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();
       int n = a.length();
       int m = n/2;
       if(n%2==0)
       {
           for(int i = 0 ; i<=m;i++)
           {
               System.out.print(a.charAt(i));
           }
       }
       else
       {
            for(int i = m+1;i<n;i++)
            {
                System.out.print(a.charAt(i));
            }
       }    
   } 
}
