import java.util.Scanner;
class MenuAr
{
public static void main(String args[])
{
int a,b,x;
Scanner s= new Scanner(System.in);
System.out.println("Enter 2 values:");
a=s.nextInt();
b=s.nextInt();
System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus\n6.Exit");
x=s.nextInt();
switch(x){
case 1:
System.out.println(a+"+"+b+"="+(a+b));
break;
case 2:
System.out.println(a+"-"+b+"="+(a-b));
break;
case 3:
System.out.println(a+"*"+b+"="+(a*b));
break;
case 4:
System.out.println(a+"/"+b+"="+(a/b));
break;
case 5:
System.out.println(a+"%"+b+"="+(a%b));
break;
default:
break;
}
}
}