import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
 String str1 = scan.nextLine();
 int n = str1.length();
 int flag = 0;
 for(int i =0;i<(n/2);i++)
 {
  if((str1.charAt(i)) != (str1.charAt(n-i-1)))
  {
   flag = 1;
   break;
  }
 }
 if(flag == 0)
 {
  System.out.print("palindrome");
 }
 else
 {
  System.out.print("Not palindrome");
 }
}
}