class Findarguments
{
public static void main(String[] args)
{
 int n = args.length;
 System.out.println("The Number of Arguments are :"+n);
 System.out.println("The Followng are the agruments:");
 for(int i = 0; i<n; i++)
 {
  System.out.println(args[i]);
 }
}
}