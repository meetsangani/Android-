class A1
{
	void a1()
	{
		System.out.println("a1 executed");
	}
}
class B1 extends A1
{
	void b1()
	{
		System.out.println("b1 executed");
	}
}
class C1 extends B1
{
	void c1()
	{
		System.out.println("c1 executed");
	}
}
class D1 extends C1
{
	void d1()
	{
		System.out.println("d1 executed");
	}
}
public class MultilevelEx 
{
	public static void main(String[] args) 
	{
			D1 d =new D1();
			
			d.a1();
			d.b1();
			d.c1();
			d.d1();
	}
}
