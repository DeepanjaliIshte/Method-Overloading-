// Example of Constructor Overloading.

public class Room 
{
	float length,breadth;
	Room(float x, float y)
	{
		length=x;
		breadth=y;							// Constructor 1
	}
	Room(float x)
	{
		length=breadth=x;					// Constructor 2
	}
	int area ()
	{
		int a;
		a=(int) (length*breadth);
		return (a);
	}
}
