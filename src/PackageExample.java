import com.practice.secondpkg.TheSampleClass;

public class PackageExample extends TheSampleClass {

	public static void main(String[] args) {
		
		PackageExample obj = new PackageExample();
		int res = obj.var;
		
		System.out.println("A protected variable Accessed from "
				+ "another class from another package, res : " +res);
		
		
	}

}
