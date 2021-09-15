class evennumbers
{
public static void main(String[] args)
{
	int lower = (int)args[0];
	int upper = (int)args[1];
	if(lower%2 == 0)
	{
		lower += 1;
	}
	for(int i=lower;i<=upper;i+=2)
	{
		System.out.println(i);
	}

}
}