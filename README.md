# Java_8_features

Java 8 features Discussion:

1) Functional Programming
2) Lambda Expression () -> System.out.println("Lambda");
3) Stream Api  -- functional programing 

stream Api is java 8 features, which is used to process huge amount of data, its lazy, fast
it also has features of parallelStream
    stream 
      |
    __ _________________
   |                    |
 Intermediate          Terminate
 filter();             findFirst();
 map();                forEach();

stream is one time use, cannot re use same stream, will get exception.

java 8 Date Api LOcaleDate, LocalTime

method refrence - import java.util.Arrays;
import java.util.List;

//call by value
//call by method/function

interface parser{
	String parse(String str);
}

class StringParser {
	public static String converter(String str) {
		if(str.length() <= 3)
			str = str.toUpperCase();
		else 
			str = str.toLowerCase();
		return str;
	}
}

class MyPrinter{
	public void print(String str, parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}


public class DemoMethodRefrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list =  Arrays.asList("Abu", "Assu", "sulthana");
		
		// list.forEach(str -> System.out.println(str));
		
		list.forEach(System.out::println);
		
		MyPrinter printer = new MyPrinter();
		printer.print("Abu", str -> StringParser.converter(str));
		printer.print("Abu kalam", StringParser::converter);
		printer.print("Abu", StringParser::converter);

	}

}


project: java_8_features
