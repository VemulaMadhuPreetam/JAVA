import java.util.Scanner;
class charat
{
public static void main(String[] args)
{
 Scanner str = new Scanner(System.in);
 String str1 = str.nextLine();
 int len = str1.length();
 int digit_count = 0;
 int lower_count = 0;
 int upper_count = 0;
 int other_count = 0;
 for(int i = 0;i<len;i++)
 {
  if(str1.charAt(i) >= '0' && str1.charAt(i) <= '9')
  {
   digit_count += 1;
  }
  else if(str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
  {
   upper_count += 1;
  }
  else if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
  {
   lower_count += 1;
  }
  else
  {
   other_count += 1;
  }
 }
 System.out.println("No of digits in the given string are : "+digit_count);
 System.out.println("No of uppercase in the given string are : "+upper_count);
 System.out.println("No of lowercase in the given string are : "+lower_count);
 System.out.println("No of other charater in the given string are : "+other_count);
}
}