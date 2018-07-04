class Indian{
	boolean IndianCitizen = true;
	
	public boolean isIndian() {
		if(IndianCitizen==true) {
		System.out.println("Is INDIAN");
		return true;
		}else {
			System.out.println("NOT INDIAN");
			return false;
		}
	}
}
class Goan extends Indian{
	boolean IsGoan = true;
	public boolean isGoan() {
		if(IsGoan==true) {
		System.out.println("Is GOAN");
		return true;
		}
		else {
		System.out.println("NOT GOAN");
		return false;
		}
	}
	
}
public class DerivedCasting {

	public static void main(String[] args) {
		
		
		Goan G1= new Goan();
		
		System.out.println("Checking if his Goan First....");
		boolean isGoan = G1.isGoan();
		if (isGoan==true ) {
			System.out.println("Nationality");
			G1.isIndian();
		}
		
		Indian I1 = G1; //Up casting
		Goan G2 = (Goan) I1 ; //Down Casting
		System.out.println("After Derived Casting");
			G2.isIndian();
	}

}
