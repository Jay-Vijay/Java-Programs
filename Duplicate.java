import java.util.*;
class Duplicate
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter values");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}

for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
a[i]=0;
}
}
System.out.println("The arrays:");
for(i=0;i<n;i++){
if(a[i]!=0)
System.out.println(a[i]);
}
}
}


