public class RemoveDup
{  
public static int RemoveDup(int a[], int n)
{  
if (n==0 || n==1)
{  
return n;  
}  
int[] temp = new int[n];  
int j = 0;  
for (int i=0; i<n-1; i++)
{  
if (a[i] != a[i+1]){  
temp[j++] = a[i];  
}  
}  
temp[j++] = arr[n-1];
for (int i=0; i<j; i++)
{          
a[i] = temp[i];  
}  
return j;  
}  

public static void main (String[] args) 
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
}
 
int length = a.length;  
length = RemoveDup(a, length);  
for (int i=0; i<length; i++)  
System.out.print(a[i]+" ");  
}  
}  