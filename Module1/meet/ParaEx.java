
public class ParaEx 
{
	int id;
	String name;
	
	public ParaEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
		ParaEx p1 =new ParaEx(101, "xyz");
		ParaEx p2 =new ParaEx(102, "abc");
		
		/*System.out.println(p1.id+" "+p1.name);
		System.out.println(p2.id+" "+p2.name);*/
		p1.display();
		p2.display();
		
	}
}
