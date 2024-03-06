import java.util.*;
public class Transpose{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

int[][] a = new int[3][3];
int[][] b = new int[3][3];
System.out.println("Enter the elements:");

for (int i = 0; i < 3; i++) 
{
for (int j = 0; j < 3; j++) 
{
a[i][j] = s.nextInt();
}
}
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j < 3; j++) 
{
b[j][i]=a[i][j];
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Tranpose:");
for (int i = 0; i < 3; i++) 
{
for (int j = 0; j < 3; j++) 
{
b[j][i]=a[i][j];
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
}
}