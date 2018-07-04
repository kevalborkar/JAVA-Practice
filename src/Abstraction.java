interface MyInterface{
	int a=1;
	public abstract void firstMethod();
	public abstract void secondMethod();
	
}
abstract class OneAbstractClass implements MyInterface{
	
	int a;
	public void oneExtraMethod(){
		System.out.println("A varialble from Interface , 'a' accessed in OneAbstractClass"
				+ " Staticly - a ="+ MyInterface.a );
	}
}
class OneNormalClass extends OneAbstractClass{

	@Override
	public void firstMethod() {
		
		System.out.println("Inside-- firstMethod() but in OneNormalClass ");
		/*System.out.println("A varialble from Interface , 'a' accessed in Normal Class"
				+ " Staticly - a = "+ MyInterface.a );*/
	}

	@Override
	public void secondMethod() {
		
		System.out.println("Inside-- secondMethod() but in OneNormalClass");
	}
	
	/*public void oneExtraMethod() {
		System.out.println("Overrided oneExtraMethod() from "
				+ "OneAbstractClass in OneNormalClass");
	}*/
	
}
class FirstClass implements MyInterface{

	@Override
	public void firstMethod() {
		System.out.println("Inside-- firstMethod() ");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("Inside-- secondMethod() ");
		
	}
	
}

class SecondClass implements MyInterface{

	@Override
	public void firstMethod() {
		System.out.println("Inside firstMethod()");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("Inside secondMethod()");
		
	}
	
}

class OneSeparateImplementaionClass {
	public MyInterface oneMethodToDoAbstraction(char choice){
		MyInterface obj;
		if(choice=='F') {
			obj = new FirstClass();
			return obj;
		}
		else {
			obj = new SecondClass();
			return obj;
		}
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
	OneSeparateImplementaionClass ImpObj = new OneSeparateImplementaionClass();
	
	MyInterface catchObj = ImpObj.oneMethodToDoAbstraction('F');
			catchObj.firstMethod();
			catchObj.secondMethod();
	
	OneNormalClass NormalObj = new OneNormalClass();
	NormalObj.firstMethod();
	NormalObj.secondMethod();
	NormalObj.oneExtraMethod();
	int res = NormalObj.a = 10;
	System.out.println(res);
	}
	

}
