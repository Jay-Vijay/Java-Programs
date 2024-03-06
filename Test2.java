class student
{
int roll_no;
String name;
void InsertRecord(int r,String n)
{
roll_no=r;
name=n;
}
void display()
{
System.out.println("Roll no:"+roll_no);
System.out.println("Name:"+name);
}
}

class Test2
{
public static void main(String args[]){
student S1=new student();
student S2=new student();
S1.InsertRecord(1,"abc");
S2.InsertRecord(2,"def");
S1.display();
S2.display();
}
}