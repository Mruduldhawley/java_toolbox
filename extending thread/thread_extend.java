class A1 extends Thread // Step 1
{
A1()
{
	start();//Step2
}
	public void run()//step 3
	{
	for (int i=0;i<10;i++)
	{
		System.out.println("A1's i="+i);
	}
	}
}

class thread2
{
  public static void main(String args[])
  {
	new A1();
	for (int i=0;i<20;i++)
	{
	   System.out.println("Main i="+i);
	}
  }
}