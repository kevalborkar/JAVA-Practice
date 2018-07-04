class SomeClassHavingFunctions{
	@SuppressWarnings("unused")
	private void somePrivatefuction() {
		System.out.println("Can we override private function?");

	}
	public void somePublicfuction() {
		System.out.println("Can we override public function?");

	}
	public static void someStaticfuction() {
		System.out.println("Can we override static function? Yes but no use");

	}
	public void someNonStaticfuction() {
		System.out.println("Can we override non static function?");

	}
	public final void somefinalfuction() {
		System.out.println("Can we override final function?");

	}
}
class OverideTest extends SomeClassHavingFunctions{
	@Override
	public void someNonStaticfuction() {
		System.out.println("Yes Can we override non static function");
	}
	@Override
	public void somePublicfuction() {
		System.out.println("Yes Can we override public function");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		OverideTest OT = new OverideTest();
		SomeClassHavingFunctions OC = new SomeClassHavingFunctions();
		//OC.somePrivatefuction(); CTE
		System.out.println("We Cannot override private function");
		OC.somePublicfuction();
		OT.somePublicfuction();
		SomeClassHavingFunctions.someStaticfuction(); 
		//This OC.someStaticfuction() is not called overriding we 
		//should access this in static way.
		//OR
		OverideTest.someStaticfuction();
		//like this
		OC.someNonStaticfuction();
		OT.someNonStaticfuction();
		
	}

}
