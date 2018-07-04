abstract class SomeAbstractClass{
	
	static int StaticVar = 10;
	 int NonStaticVar = 15;
	abstract void someAbstractMethod();
	//abstract static void someStaticAbstractMethod();//Not Possible
	//abstract private void somePrivateAbstractMethod();//Not Possible
	//abstract final void someFinalAbstractMethod();//Not Possible
	public void concreteMethod() {
		System.out.println("Inside a Concrete Method");
	}
	
}

class SomeSubclass extends SomeAbstractClass{

	@Override
	void someAbstractMethod() {
		System.out.println("Abstract Method - 'someAbstractMethod()' overriden in some Subclass ");
		
	}
	
}
public class AbstractExamples {

	public static void main(String[] args) {
		//SomeAbstractClass obj = new SomeAbstractClass(); 
		//Cannot create instance/objects of abstract class.
		SomeSubclass obj = new SomeSubclass();
		obj.concreteMethod();
		obj.someAbstractMethod();
		@SuppressWarnings("unused")
		SomeAbstractClass ref ; //This 'ref' can be used for
		//1.Derived Casting 2.Run Time PolyMorphism 3.Abstraction
		System.out.println("Static Variable from 'SomeAbstractClass'"
					+SomeAbstractClass.StaticVar);
		System.out.println("Non Static Variable from 'SomeAbstractClass'"
				+obj.NonStaticVar);
	}

}
