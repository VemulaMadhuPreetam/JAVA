class sumofdigitofanumber
{
public static void main(String[] args)
{
 int num = Integer.parseInt(args[0]);
 int sum = 0;
 int temp = num;
 while(temp != 0)
 {
  sum += (temp%10);
  temp = temp/10;
 }
 System.out.print("Sum of the digits "+num+" is : "+sum);
}
}
