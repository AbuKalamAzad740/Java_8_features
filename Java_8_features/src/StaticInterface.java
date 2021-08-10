interface I {
	
	// method implementation in java 8 using static
	static void show() {
		System.out.println("Interface Static method implementation");
	}
	
	// method implementation in java 8 using default
	default void showMethod(int a) {
		System.out.println("Interface default method implementation "+ a);
	}
	void call();
}

public class StaticInterface implements I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          I.show();
          I obj = new StaticInterface();
          obj.showMethod(5);
          obj.call();
	}

	@Override
	public void call() {
		System.out.println("call override method");
		// TODO Auto-generated method stub
		
	}

}
