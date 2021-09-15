class fun
{
public static void main(String[] args)
{
 int[] arr = new int[10]args;
 int n = args.length;
 int sum1 = 0;
 int max = Integer.MIN_VALUE;
 int min = Integer.MAX_VALUE;
 for (int i = 0; i < n ; i++)
 {
  arr[i] = Integer.parseInt(args[i]);
  sum1 += arr[i];
  if(min > arr[i])
  {
   min = arr[i];
  }
  if(max < arr[i])
  {
   max = arr[i];
  }
 }
 System.out.println("Maximum sum of 9 numbers is : "+(sum1-min));
 System.out.println("Minimum sum of 9 numbers is : "+(sum1-max));
}
}