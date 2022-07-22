class Bank
{
	void bank()
	{
		System.out.println("banking");
	}
}
class Current extends Bank
{
	void currrent()
	{
		System.out.println("current");
	}
}
class Save extends Bank
{
	void save()
	{
		System.out.println("saving");
	}
}
public class HierarchicalEx 
{
	public static void main(String[] args) 
	{
		
		Current c =new Current();
		Save s =new Save();
		
		c.currrent();
		s.save();
		c.bank();
		
	}
}
