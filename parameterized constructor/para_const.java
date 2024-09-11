class Test1
{
	int a,b;//instance variable
	Test1(int x,int y)//Parameterized constructor
	{
	a=x;
	b=y;
	}
	void disp()
	{
	System.out.println("the values are "+a+" "+b);

	}
}

class Test2
{
	public static void main(String a[])
	{
	Test1 ob1 = new Test1(40,50);
	ob1.disp();
	}
}