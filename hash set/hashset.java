import java.util.*;
public class hashset{
public static void main(String args[])
{
//creating hashset and adding elements
HashSet set=new HashSet();
set.add("Ryan");
set.add("Madison");
set.add("Laura");
set.add("Matty");
set.add("Ryan");
set.add("Athena");

System.out.println(set);
set.remove("Ryan");

//traversing elements

Iterator itr=set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}}}