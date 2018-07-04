
public class BlocksExample {
	
	static{
		System.out.println("Block1 (Static)");
		//Is Printed only Once
	}
	{
		System.out.println("Block2");
		//Non-static blocks printed every time object is created
		
	}
	{
		System.out.println("Block3");
		
	}	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BlocksExample BE = new BlocksExample();
		BlocksExample BE1 = new BlocksExample();
		
	}

}
