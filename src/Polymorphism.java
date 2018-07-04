interface TheInterface {
	
	public abstract void oneAbstractMethod();

}
class FirstImplementationClass implements TheInterface //Inheritance
{

	@Override
	public void oneAbstractMethod() //Overriding
	{
		System.out.println("Inside- FirstImplementationClass");
		
	}
	
}
class SecondImplementationClass implements TheInterface //Inheritance
{

	@Override
	public void oneAbstractMethod() //Overriding
	{
		System.out.println("Inside- SecondImplementationClass");
		
	}
	
}
class AClassWhichHasAStaticMethod {
	
	public static void someStaticMethod(TheInterface obj)//Up-casting
	{
		obj.oneAbstractMethod();
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
	FirstImplementationClass First = new FirstImplementationClass();
	
	AClassWhichHasAStaticMethod.someStaticMethod(First);
	
	SecondImplementationClass Second = new SecondImplementationClass();
	
	AClassWhichHasAStaticMethod.someStaticMethod(Second);
	
	}

}
