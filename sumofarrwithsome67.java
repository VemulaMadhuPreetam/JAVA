class fun1
{
public static void main(String[] args)
{
 int[] arr = new int[100];
 int n = args.length;
 int sum1 = 0;
 int temp67 = 0;
 int sum67 = 0;
 int flag = 0;
 for(int i = 0;i<n;i++)
 {
  arr[i] = Integer.parseInt(args[i]);
  if(arr[i] == 6)
  {
   flag = 1; 
  }
  if(flag == 1)
  {
   temp67 += arr[i];
  }
  if(arr[i] == 7)
  {
   sum67 += temp67;
   flag = 2;
   temp67 = 0;
  }
  sum1 += arr[i];
 }
 System.out.println(sum1-sum67); 
}
}
 