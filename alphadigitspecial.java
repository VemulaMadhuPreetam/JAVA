class alphadigitspecial
{

public static void main(String ar[])
{
	char check = '@';
	int d_check = (int)check;
	if(((d_check>64) &&(d_check<91)) ||((d_check>96) && (d_check < 123 )))
	{
		System.out.println("Alphabet");
	}
	else if((d_check >47) && (d_check < 58))
	{
		System.out.println("Digit");
	}
	else
	{
		System.out.println("Special");
	}
}
}