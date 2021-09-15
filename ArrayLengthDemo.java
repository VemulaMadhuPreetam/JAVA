public class ArrayLengthDemo
{
public static void main(String[] args)
{
 int[] source = {100,200,300};
 int[] dest = new int[3];
 System.arraycopy(SOurce,0,dest,0,source.length);
 for (int i = 0;i < dest.lenght;i++)
 {
  System.out.println(dest[i]);
 }
}
}
