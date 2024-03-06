abstract class Bank
{
abstract int getRateOfInterest();
}
class CUB extends Bank
{
int getRateOfInterest()
{
return 5;
}
}
class PNB extends Bank
{
int getRateOfInterest()
{
return 6;
}
}
public class TestBank
{
public static void main(String[] args)
{
Bank b;
b = new CUB();
System.out.println("City Union Bank Interest Rate:"+ b.getRateOfInterest()+"" );
b = new PNB();
System.out.println("Punjab National Bank Interest Rate:" + b.getRateOfInterest()+"" );
}
}