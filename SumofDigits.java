class SumofDigits
{
    public static void main(String[] args)
{
    int a,sum=0,rem=0;
    a=Integer.parseInt(args[0]);
    while(a!=0)
    {
     rem=a%10;
     sum=sum+rem;
     a=a/10;
     }
     System.out.println("Sum of digits="+sum);
}
}