
public class Shape 
{
	int l,b,p;
	float r,pi=3.14f,arc,h,ar;
	 void area (int x,int y)
	{
		l=x;
		b=y;
		p=2*(l+b);
		System.out.println("Perimeter of rectangle: "+p);
	}
	void  area (float x)
	 {
		r=x;
		arc=2*pi*r;
		System.out.println("Circumference of circle is: "+arc);
	 }
	 void area(int x, float y)
	 {
		 b=x;
		 h=y;
		 ar=1/2*b*h;
		 System.out.println("Area of triangle: "+ar);
	 }
}
