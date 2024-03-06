import java.util.Scanner;
class circle
{
int radius;
circle()
{
radius=0;
}

circle(int r){
radius=r;
}
}
class Object
{
Scanner S=new Scanner(System.in);
public static void main(String args[])
{
int n=S.nextInt();
circle r=new circle(r);
System.out.println("Radius:"+r.radius);
}
}



