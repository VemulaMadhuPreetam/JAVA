import java.util.Scanner;
class loweruppercase
{
public static void main(String[] args)
{
 Scanner a = new Scanner(System.in);
 String str1 = a.nextLine();
 System.out.println("Upper Case : "+str1.toUpperCase());
 System.out.println("Lower Case : "+str1.toLowerCase());
 System.out.println("Original string : "+str1);
}
}