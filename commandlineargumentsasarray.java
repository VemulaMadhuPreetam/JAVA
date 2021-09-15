class fun
{
public static void main(String[] args)
{
 int[] arr = new int[10];
 int n = args.length;
 float sum1 = 0;
 float avg ;
 int max = Integer.MIN_VALUE;
 int min = Integer.MAX_VALUE;
 int max1 = Integer.MIN_VALUE;
 int min1 = Integer.MAX_VALUE;
 for(int i = 0; i<n ; i++)
 {
  arr[i] = Integer.parseInt(args[i]);
  sum1 += arr[i];
  if(min > arr[i])
  {
   min1 = min;
   min = arr[i];
  }
  else if(min1 > arr[i])
  {
   min1 = arr[i];
  }
  if(max < arr[i])
  {
   max1 = max;
   max = arr[i];
  }
  else if(max1 < arr[i])
  {
   max1 = arr[i];
  }
 }
 System.out.println("MAX value of the array is : "+max);
 System.out.println("MIN value of the array is : "+min);
 System.out.println("Second MAX value of the array is : "+max1);
 System.out.println("Second MIN value of the array is : "+min1);
 System.out.println("Sum of the array elements is : "+sum1);
 avg = sum1/n;
 System.out.println("Average of the array elements is : "+avg);
}
}