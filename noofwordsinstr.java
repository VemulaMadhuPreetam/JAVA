import java.util.Scanner;

public class noofwordsinstr
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int n = a.length();
    int flag = 0;
    int count = 0;
    for(int i = 0; i<n;i++)
    {
        if(flag == 0)
        {
            if(a.charAt(i)==' ')
            {
                flag = 1;
            }
        }
        else
        {
            if(a.charAt(i) != ' ')
            {
                flag = 0;
                count += 1;
            }
        }
    }
    System.out.println(count);
}
}
 