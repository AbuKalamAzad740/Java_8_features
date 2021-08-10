
interface XYZ{
	int b(String str);
}

class ABC{
	void abc(String str, XYZ xyz) {
		System.out.println("xyz" + xyz);
		System.out.println(xyz.b(str));
		int value = xyz.b(str);
		System.out.println(str +" :"+ value);
	}
}

class Length{
	int showLegth(String str) {
		return str.length();
	}
}

public class DemoMethodRefrence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Length l = new Length();
        ABC abc = new ABC();
        abc.abc("abu kalam", l::showLegth);
	}

}
