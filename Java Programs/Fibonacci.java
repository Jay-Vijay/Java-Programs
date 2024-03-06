
class Fibonacci
{
    public static void main(String[] args)
   {		
    int i,a=-1,b=1,ans=0,n;
    n=Integer.parseInt(args[0]);
    for(i=0;i<n;i++)
        {
        ans=a+b;
        a=b;
       b=ans;
       System.out.println(ans);
       }
    }
}