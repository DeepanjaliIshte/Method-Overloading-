
public class Room_Test 
{
	public static void main(String[] args) 
	{
		Room r=new Room(1.7f,7.1f);
		int a=r.area();
		System.out.println("area : "+a);
		Room r1=new  Room(2.3f);
		int a1=r1.area();
		System.out.println("Area :"+a1);
	}
}
