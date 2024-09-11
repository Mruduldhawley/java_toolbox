import java.util.*;  

    public class Linked{  
    public static void main(String args[]){  
    LinkedList al=new LinkedList();  
    al.add("Ayan");  
    al.add("Roy");  
    al.add("S");  
    al.add(25);  
    System.out.println("Size of al after additions: " + al.size());
    Iterator itr=al.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    } 
 
    al.remove("Roy");
    al.remove(2);//removing using index
    Iterator itr2=al.iterator();  
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
    } 


    
     //Traversing list using for but converting to string
    
    String s2;
     
    for(int i=0;i<al.size();i++)
    {  
      
     
     s2=al.get(i).toString();
     
     System.out.println(s2);
     
     }
    }  
    }  