@FunctionalInterface
interface OneInterface{
	public void onemethod();
}

class ASampleClass {

	public static void oneMoreMethod(OneInterface obj) {
		obj.onemethod();
	}
	
}
public class LambdaExample {

	public static void main(String[] args) {
		OneInterface ref1 = ()->
		{
			System.out.println("Lambda Fucntion 1..");
		};
		
		ASampleClass.oneMoreMethod(ref1);
		
		OneInterface ref2 = ()->
		{
			System.out.println("Lambda Fucntion 2..");
		};
		
		ASampleClass.oneMoreMethod(ref2);

	}

}
