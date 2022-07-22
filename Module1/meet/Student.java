
public class Student 
{
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		
		//classname objectname =new classname();
		
		Student s1 = new Student();
		
		s1.id=101;
		s1.name="meet";
		
		Student s2 =new Student();
		s2.id=102;
		s2.name="darshan";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
		
	}
}
