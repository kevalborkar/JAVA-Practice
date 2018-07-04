
public class LibrariesExamples {

	public static void main(String[] args) {
		
		StudentClass s1 = new StudentClass(1, "Keval", 503.4);
		StudentClass s2 = new StudentClass(2, "Arman", 577.4);
		StudentClass s3 = new StudentClass(3, "Faizan", 590.4);
		StudentClass s4 = new StudentClass(1, "Akshay", 507.4);
		StudentClass s5 = new StudentClass(5, "Apeksha", 543.4);
		
		
		
		int Id = s1.hashCode();
		System.out.println("Id :"+ Id);
		String res = s1.toString();
		System.out.println(res);
		 res = s2.toString();
		System.out.println(res);
		
		boolean res1 = s1.equals(s5);
		if(res1) {
			System.out.println("S1 = S2");
		}else {
			System.out.println("S1 != S2");
		}
		
		boolean res2 = s3.equals(s4);
		if(res2) {
			System.out.println("S1 = S2");
		}else {
			System.out.println("S1 != S2");
		}
	}

}
