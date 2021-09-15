class reversenumber
{
public static void main(String[] args)
{
 String num = args[0];
 int number = Integer.parseInt(args[0]);
 int temp = number;
 int reverse = 0,digit;
 while(temp != 0)
 {
  reverse = (reverse*10)+temp%10;
  temp = temp/10;v
 }
 System.out.println("The reverse of a "+number+" is : "+reverse);
 if(reverse == number)
 {
  System.out.println("The given number "+number+" is plaindrome.");
 }
 else
 {
  System.out.println("The given number "+number+" is not plaindrome.");
 }
}
}