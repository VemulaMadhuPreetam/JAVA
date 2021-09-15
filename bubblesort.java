class bubblesort
{
public static void main(String[] args)
{
 int[] arr = new int[10];
 int n = args.length;
 int temp;
 for(int i1 = 0; i1 < n ;i1++)
 {
  arr[i1] = Integer.parseInt(args[i1]);
 }
 for(int i = 0; i < n; i++)
 {
  for(int j = 0; j < n-i-1; j++)
  {
   if(arr[i] < arr[i+1])
   {
    temp = arr[i];
    arr[i] = arr[i+1];
    arr[i+1] = temp;
   }
  } 
 }
System.out.print("The Sorted elements are : ");
for(int i2 = 0; i2 < n;i2++)
{
 System.out.print(i2+" ");
}
}
}