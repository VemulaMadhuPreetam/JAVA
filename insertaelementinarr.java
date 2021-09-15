class insert
{
public static void main(String[] args)
{
 int[] arr = new int[12];
 int n = args.length;
 int j;
 for(int i= 0; i<n-2;i++)
 {
  arr[i] = Integer.parseInt(args[i]);
 }
 for(j = n-2; j!= Integer.parseInt(args[n-2])-1; j--)
 {
  arr[j] = arr[j-1];
 }
 arr[j] = Integer.parseInt(args[n-1]);
 n += 1;
 for(int k = 0; k!=n;k++)
 {
  System.out.print(arr[k]+" ");
 }
}
}