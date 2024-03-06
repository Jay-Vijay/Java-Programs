import java.util.*;
class Duplicates{
public static void main(String args[]){
int i,j,n;
Scanner s= new Scanner(System.in);
System.out.println("Enter size and elements:");
n=s.nextInt();
int[] arr=new int[n];
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
    //int[] arr=new int[n];
for(i=0;i<n;i++)
{
for( j=i+1;j<n;j++)
{
if(arr[i]==arr[j]){
arr[i]=0;
}}}
System.out.println("The array:\n");
for(i=0;i<n;i++){
if(arr[i]!=0){
System.out.println(arr[i]);
}}}}