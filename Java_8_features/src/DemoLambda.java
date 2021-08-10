interface A{
	void show(int i);
}

//class xyz implements A {
//
//	@Override
//	public void show(int i) {
//		System.out.println("Hello" + i);
//	}
//	
//}

public class DemoLambda {

	public static void main(String[] args) {
		A obj;
//		obj = new A() // Ananymous Inner class
//		{
//			public void show() {
//				System.out.println("interface show implemented");
//			}
//		};
		// obj = (int i) -> System.out.println("hello "+ i);
		obj = i -> System.out.println("hello "+ i); // consumer interface
		obj.show(6);
	}
}
