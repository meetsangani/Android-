class P
{
	void p()
	{
		System.out.println("p executed");
	}
}
interface Q 
{
	void q();
}
class R extends P
{
	void r()
	{
		System.out.println("r executed");
	}
}
class S extends R implements Q
{
	void s()
	{
		System.out.println("s executed");
	}

	@Override
	public void q() {
		// TODO Auto-generated method stub
		System.out.println("q executed");
	}
}
public class HybridEx 
{
		public static void main(String[] args) {
			
			
			S s =new S();
			
			s.p();
			s.q();
			s.r();
			s.s();
		}
}
