class nomatch extends Exception//user defined exception
{
}
class Throweg
{
void check(String s1)throws nomatch
{
char ch;
ch=s1.charAt(0);
if(ch=='M')
{
System.out.println("Valid Id");
}
else
{
throw new nomatch();
}
}}

class user_exp
{
public static void main(String args[])
{
Throweg ob=new Throweg();
try
{
ob.check("Microsoft");
}
catch(nomatch e)
{}
finally{
System.out.println("Thanks");
}}
}