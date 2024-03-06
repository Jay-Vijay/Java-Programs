import java.util.Scanner;
class student{
int roll_no;
String name;
void getStudent(int r,String n)
{
roll_no=r;
name=n;
}
void display()
{
System.out.println("name:"+name+"\n"+"roll_no"+roll_no);
}
}
class Details{
public static void main(String args[])
{
int b;
String a;
student s1=new student();
Scanner in=new Scanner(System.in);
System.out.println("Enter roll no. and name:");
b=in.nextInt();
a=in.next();
s1.getStudent(b,a);
s1.display();
}

}