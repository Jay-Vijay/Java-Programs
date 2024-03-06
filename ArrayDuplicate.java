import java.util.Scanner;
class ArrayDuplicate
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.in("Enter size:");
int size=s.nextInt();
int a[]=new int[size];
int i,j,k;
System.out.println("Enter the values:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
arrays.sort(a);
}

for(i=0;i<size-1;i++)
{
if(a[i]!=a[i+1])
{
a[j++]=a[i];
a[j]=a[size-1];
}
}
for(i=0;i<j;i++)
{
System.out.println(a[i]);
}
}
}

