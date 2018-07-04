
public class PrimitiveCasting {
	protected short LowerData = 10;
	public static void main(String[] args) {
		//widening
		short LowerData = 10;
		char LowerData1 = 'P';
		int widening = LowerData1;
		System.out.println("LowerData (short):"+LowerData);
		System.out.println("LowerData1 (char):"+LowerData1);
		System.out.println("Widenning - Char converted to Integer:"+widening);
		
		//narrowing
		double higherData = 10.9;
		int narrowing = (int) higherData; //casting statement
		System.out.println("higherData (double):"+higherData);
		
		System.out.println("Narrowing - double converted to Integer:"+narrowing);
	}

}
