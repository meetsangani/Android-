//interface:collection of abstract methods
interface Print
{
	void print();
}
interface Show
{
	void show();
}
public class A7 implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing");
	}
	
	public static void main(String[] args) {
		
		A7 a =new A7();
		a.print();
		a.show();
		
	}

}
