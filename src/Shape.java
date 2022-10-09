
public class Shape 
{
	public void findArea(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of rectangle is:"+area);
	}
	public float findArea(float b,float h)
	{
		float area=1/2*b*h;
		return area;
	}
	public void findArea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle is"+area);
	}
	public void findarea(int a)
	{
		int area=a*a;
		System.out.println("Area of square is:"+area);
	}

	public static void main(String[] args) 
	{
	   Shape s=new Shape();
	   s.findArea( 4.2);
	   s.findArea(5, 4);
	   s.findarea(5);
	   s.findArea(3.14f,3.4f);
	  
       
       
	}

}
