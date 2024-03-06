import java.util.Scanner;
import java.util.Arrays;

class BinarySearch{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + (last-mid));  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
public static void main(String args[])
{  
int i;
Scanner s=new Scanner(System.in);
System.out.println("Enter size");
int n=s.nextInt();

int arr[]=new int[n];
System.out.println("Enter values");
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
Arrays.sort(arr);
System.out.println("Enter no. to find");
int key=s.nextInt();  

int last=arr.length-1;  
binarySearch(arr,0,last,key);     
 }  
}  