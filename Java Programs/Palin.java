import java.util.*;
class Palin {
public static void main (String args[])
{
Scanner s= new Scanner(System.in);
String s1= s.next();
StringBuffer f=new StringBuffer(s1);
String r=new String(f.reverse());
System.out.println(r.equals(s1));
}
}