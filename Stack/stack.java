import java.util.*;
class stackeg
{
public static void main(String args[]){
Stack stack1=new Stack();
stack1.push("ABC");
stack1.push("asfsa");
stack1.push("MRudul");
stack1.push("Mansi");
stack1.push("Adarsh");
System.out.println("before pooping any value");
Iterator itr=stack1.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

stack1.pop();

System.out.println("After pooping");
Iterator itr2=stack1.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
//removing elements from stack

stack1.remove(2);

System.out.println("After Removing");
Iterator itr3=stack1.iterator();
while(itr3.hasNext()){
System.out.println(itr3.next());
}
//to display the top element of the stack

String s1=stack1.peek().toString();
System.out.println(s1);

//to check wheather a stack is empty or not
boolean b=stack1.empty();
System.out.println(b);

//to search an element in stack

int pos=stack1.search("Mrudul");
System.out.println("The elemnts is present in"+pos+"Position");

int pos1=stack1.search("ABC");
System.out.println("the element is present in "+pos1+"positon");

//to remove all elements from stack
stack1.removeAllElements();
System.out.println(stack1);
}}

