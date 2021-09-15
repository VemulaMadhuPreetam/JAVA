import java.lang.Math;
class primenumber
{
public static void main(String[] args)
{
 int lower = Integer.parseInt(args[0]) ,upper = Integer.parseInt(args[1]);
 int flag = 0;
 double s = Math.sqrt(lower);
 System.out.print("The primenummber in range "+lower+" to "+upper+" are :");
 for(int num=lower;num<=upper;num++)
 {
  flag = 0;
  s = Math.sqrt(num);
  if(num == 0 || num == 1)
  {
     continue;
  }
  else
  {
   for(int i=2;i<=s;i++)
   {
    if(num%i == 0)
    {
     flag = 1;
     break;
    }
   }
   if(flag == 0)
   {
    System.out.print(" "+num);
   }
  }
 }
}
}