class Thread1 implements Runnable//step1
{
	public void run()//step 4
	{
	for(int i=0;i<10;i++)
	{	
		System.out.println("Thread1's i="+i);
	}
	}
}
class Thread2 implements Runnable//step1
{
	public void run()//step 4
	{
	for(int i=0;i<10;i++)
	{	
		System.out.println("Thread2's i="+i);
	}
	}
}
class Thread3 implements Runnable//step1
{
	public void run()//step 4
	{
	for(int i=0;i<10;i++)
	{	
		System.out.println("Thread3's i="+i);
	}
	}
}


class Thread4	
{
   public static void main(String args[])
   {
	Thread1 ob=new Thread1();
	Thread2 ob1=new Thread2();
	Thread3 ob2=new Thread3();
	Thread t=new Thread(ob);//step 2
	Thread t1=new Thread(ob1);
	Thread t2=new Thread(ob2);
	t.start();//step 3
	t1.start();
	t2.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("Thread main's i="+i);
	}
   }
}