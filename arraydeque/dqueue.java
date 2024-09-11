import java.util.*;
public class dqueue
{
public static void main(String args[]){
//creating Deque and addding elemnets
Deque deque=new ArrayDeque();
deque.add("Amit");
deque.add("Amy");
deque.add("brian");
deque.add("Laura");
deque.add("Massimo");

System.out.println(deque);
deque.offerFirst("Ryan");
deque.offerLast("Matty");
System.out.println(deque);
deque.pollFirst();
deque.pollLast();
System.out.println(deque);
}}