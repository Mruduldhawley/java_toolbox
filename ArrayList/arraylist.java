import java.util.*;

class ArrayListDemo{

public static void main(String args[]){
//create an arrray list

ArrayList al = new ArrayList();
System.out.println("Initial Size of al:"+ al.size());

//add elements to the arrary list

al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
al.add(5);
al.add("Mrudul");
al.add(20.25);
al.add(1,"A2");//Adding elemnts in middle
System.out.println("Size of al after addition:"+ al.size());

//displaying the array list 
System.out.println("Content of al:"+ al);

//Remove elements from the array list

al.remove("F");
al.remove(2);//removing using index
System.out.println("Size of al after deletions: "+ al.size());
System.out.println("Content of al:"+ al);

//Traversing list through Iterator but converting to string

String s;
Iterator itr2=al.iterator();
while(itr2.hasNext())
{
 s=itr2.next().toString();
 System.out.println(s);
}

//Traversing list using for but converting to string

String s2;

for(int i=0;i<al.size();i++)
{
 s2=al.get(i).toString();
 System.out.println(s2);

}
}}
