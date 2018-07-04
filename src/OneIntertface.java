public interface OneIntertface 
{
	int b=20;
public default void display()
{
	System.out.println("This is display() in OneInterface");
}
}
interface AnotherInterface
{
	public default void display()
	{
		System.out.println("This is display() in AnotherInterface");
	}
}
