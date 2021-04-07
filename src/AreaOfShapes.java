class Operations2
{
	public float areaOfSquare(float side)
	{
		return 4 * side;
		
	}
	public float areaOfRectangle(float length, float width)
	{
		return length * width;
		
	}
	public double areaOfCircle(float radius)
	{
		
		return  4 * Math.PI  * radius * radius;
		
	}
	public float areaOfTriangle(float base, float height)
	{
		return (base * height)/2;
		
	}
}

public class AreaOfShapes {

	public static void main(String[] args) {
		
		Operations2 ops = new Operations2();
		
		System.out.println("Area of Circle is " + ops.areaOfCircle(15));
		System.out.println("Area of Circle is " + ops.areaOfRectangle(15, 20));
		System.out.println("Area of Circle is " + ops.areaOfSquare(8));
		System.out.println("Area of Circle is " + ops.areaOfTriangle(6, 12));
	}

}
