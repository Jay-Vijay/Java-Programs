import java.util.Scanner;
class fact
{
public static void main(String args[])
{
int i=1,fact=1,n;
Scanner s= new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}