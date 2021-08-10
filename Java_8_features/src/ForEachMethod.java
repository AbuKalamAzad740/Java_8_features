import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// for each method in java 8
// External Loops
// Internal Loops - java 8
public class ForEachMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(4, 5, 6, 7, 8);
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		for(int i: list) {
//			System.out.println(i);
//		}
		
		// java 8 foreach
		//list.forEach(i -> System.out.println(i)); // Lambda Expression //consumer 
//	    Consumer<Integer> cons = new Consumer<Integer>() {
//	    	public void accept(Integer i) {
//	    		System.out.println("i" + i);
//	    	}
//	    };
		Consumer<Integer> cons = i -> System.out.println("i "+ i);
		list.forEach(cons);
	}

}

//class consImpl implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println("integer" + t);
//	}
//}
