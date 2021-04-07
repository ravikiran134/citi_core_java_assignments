class Operations
{
	public void sum(float var1, float var2)
	{
		System.out.println("Sum of " + var1 + " and " + var2 + " is " + (var1 + var2));
		
	}
	
	public void difference(float var1, float var2)
	{
		System.out.println("Difference of " + var1 + " and " + var2 + " is " + (var1 - var2));
	}
	public void product(float var1, float var2)
	{
		System.out.println("Product of " + var1 + " and " + var2 + " is " + (var1 * var2));
	}
	
}

public class ArithmeticOps {
 
	public static void main(String[] args) {
		
		Operations op = new Operations();
		op.sum(10, 15);
		op.difference(155, 128);
		op.product(200, 250);

	}

}
