import java.util.Scanner;
class fredigitinstr
{
public static void main(String[] args)
{
 int[] fre= {0,0,0,0,0,0,0,0,0,0};
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 int n = str.length();
 for(int i = 0; i<n; i++)
 {
  if(('0'<= str.charAt(i)) && ('9'>= str.charAt(i)))
  {
   fre[(int)str.charAt(i) - 48] += 1;
  }
 }
 for(int i = 0; i<10; i++)
  System.out.println("No of "+i+" in the given string are : "+fre[i]);
}
}