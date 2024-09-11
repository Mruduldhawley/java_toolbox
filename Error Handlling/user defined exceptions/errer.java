import java.io.*;
class notdivisible extends Exception
{
}

class divide
{
void check(int x,int y)throws notdivisible
{
if (x%y==0)
{System.out.println("Divisible");}
else
{throw new notdivisible();}
}
}
class mainthing
{
public static void main(String args[])throws IOException
{
DataInputStream ds=new DataInputStream(System.in);//keyboard input
System.out.println("Input 2 nos");
int a=Integer.parseInt(ds.readLine());
int b=Integer.parseInt(ds.readLine());
divide ob=new divide();
try
{
ob.check(a,b);
}
catch(notdivisible e)
{
System.out.println("Not divisible");
}
finally
{System.out.println("End");}
}}
