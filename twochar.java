class twochar
{
	public static void main(String ar[])
	{
	char first = ar[0];
	char second = ar[1];
	int d_first = (int)first;
	int d_second = (int)second;
	if(d_first < 91)
	{
		d_first += 32;
	}
	if(d_second < 91)
	{
		d_second += 32;
	}
	if(d_first < d_second)
		{
		System.out.println(first+" "+second);
		}
	else
		{
		System.out.println(second+" "+first);
		}
	}
}