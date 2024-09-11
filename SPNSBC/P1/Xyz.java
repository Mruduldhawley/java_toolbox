package P1;
public class Xyz
{
public void display()
{
Abc ob=new Abc();
System.out.println(ob.a);//Same package
System.out.println(ob.b);//Same package
//System.out.println(ob.c);//Since not same class ,private apllied hence wl not display
System.out.println(ob.d);//since saved under same package though not a subclass wl b displayed
}
}