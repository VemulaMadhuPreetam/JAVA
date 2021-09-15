class Test
{
 public static void main(String args[])
 {
  String str1 = "hello world";
  String str2 =new String("hello again");
  char[] arry = { 'h','e','l','l','o','.'};
  String str3 =  new String(arry);
  System.out.println(str1);
  System.out.println(str2);
  System.out.println(str3);
  str3 = str2.concat(str3);
  System.out.println(str3);
  str2.concat(str1);
  System.out.println(str2+" here the string is not updated");

 }
}