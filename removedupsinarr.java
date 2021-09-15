class dups
{
    public static void main(String[] args) {
        int[] arr = new int[10];
        int m = 0;
        int temp,new_n;
        int n = args.length;
        for(int i = 0; i< n ; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i < n ; i++)
        {
            for(int j = i+1; j < n ;j++)
            {
                if(arr[i] == arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[n-1-m];
                    arr[n-1-m] = temp;
                    m += 1;
                }
            }
        }
        new_n = n-m;
        for(int k = 0;k < new_n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}