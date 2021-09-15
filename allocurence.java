package string;

import java.util.Scanner;

public class allocurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String search = sc.nextLine();
        int n = a.length();
        int occur = a.indexOf(search);
        if(occur == -1)
        {
            System.out.print("Does not present in string");
        }
        else
        {
            int count = 1;
            while(occur != -1)
            {
                System.out.println("The "+count+" of "+search+" in the given string is at : "+occur);
                occur = a.indexOf(search,occur+1);
                count += 1;
            }
        }
        
    }
}
