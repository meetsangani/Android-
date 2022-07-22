class M
{
	String color="black";
}
class N extends M
{
	String color="white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class KeywordEx 
{
	public static void main(String[] args) {
		
		N n =new N();
		n.display();
		
	}
}
