final class FinalClass{
	
}
class Another {
	
	int data = 25;
	public Another(){
		System.out.println("Another Constructor...");
	}
	public void property1(){
		System.out.println("Inside Another class");
	}
	public final void finalFunction() {
		System.out.println("Final Function Got inherited");
	}
	
	
}
class One extends Another{
	final int dataF =20;
	static int dataS =25; 
	
	 
	public void property2() {
		System.out.println("Inside One Class");
	}

}
public class Inheritance extends One{
	
	public static void main(String[] args){
		Inheritance I1 = new Inheritance(); 
		I1.property2();
		I1.property1();
		//I1.dataF =25; final Member cannot be inherited.
		I1.finalFunction();
		
		One O1 = new One();
		O1.finalFunction();
		
	}

}
