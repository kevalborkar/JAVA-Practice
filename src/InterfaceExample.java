interface TheGreatInteface {
	/*public TheGreatInteface () {
		NOT Possible
	}*/
	int x = 12;
	static double y =10.1;
	static final char z ='G';
	
	public abstract void anAbstractMethod();
	public default void oneMoreMethod() {
		System.out.println("Just a method -called default method");
	}
	
	public static void aStaticMethod(){
		System.out.println("Static Method Overrided in"
				+ "Inteface");
	}
	
	
}

class ImplementationClass implements TheGreatInteface{

	@Override
	public void anAbstractMethod() {
		System.out.println("Abstract Method Overrided in"
				+ "Implementation class");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TheGreatInteface ref  ; //This 'ref' can be used for
		//1.Derived Casting 2.Run Time PolyMorphism 3.Abstraction
		ImplementationClass IC1 = new ImplementationClass();
		IC1.anAbstractMethod();
		TheGreatInteface.aStaticMethod();
		System.out.println("x = "+TheGreatInteface.x);
		System.out.println("y = "+TheGreatInteface.y);
		System.out.println("z = "+TheGreatInteface.z);
		IC1.oneMoreMethod();
		//TheGreatInteface.oneMoreMethod();Not possible only static methods
										//can be called like this.
		
	}

}
