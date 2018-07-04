public class MethodOverloading {
	static int a ;
	int b ;
	public static void firstFunc() {
		System.out.println("Can static fuction overloaded?");
	}
	public void secondFunc() {
		System.out.println("Can Non-static fuction overloaded?");
	}
	public static int firstFunc(int a) {
		
		System.out.println("This is overloaded firstFunc()");
		return a;
	}
	public int secondFunc(int b) {
		this.b = b;
		System.out.println("This is overloaded secondFunc()");
		return b;
	}
	
	public static void main(String[] args) {
	
		firstFunc();
		System.out.println("firstFunc() - Yes");
		int res = firstFunc(45);
		System.out.println("Overloaded firstFunc() - Yes ,a="+res);
		MethodOverloading MO1 = new MethodOverloading();
		MO1.secondFunc();
		System.out.println("secondFunc() - Yes");
		res = MO1.secondFunc(5);
		System.out.println("Overloaded secondFunc() - Yes, b="+res);
		
	}

}
