
public class SuperKeywordTest implements OneIntertface,AnotherInterface
{
	int a=10;
	@Override
	public void display() 
	{
		System.out.println(OneIntertface.b);
		OneIntertface.super.display();
		AnotherInterface.super.display();
		System.out.println("this is disp impl");
	}
public static void main(String[] args) 
{
	SuperKeywordTest i=new SuperKeywordTest();
	i.display();
}
}
