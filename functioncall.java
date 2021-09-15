class First 
{
 int a = 10;
 void update(int value)
 {
  a = value;
 }
 void disp()
 {
  System.out.println("Value of a is : "+a);
 }
 public static void main(String args[])
 {
  First fob = new First();
  System.out.println(fob.a);
  fob.update(9);
  fob.disp();
 }
}