class A
{
	void a()
	{
		System.out.println("a executed");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("b executed");
	}
}
public class SingleEx 
{
	public static void main(String[] args) {
		
		B b =new B();
		
		b.a();
		b.b();
		
		
		/*A a =new A();
		B b =new B();
		
		a.a();
		b.b();
		*/
	}
}
