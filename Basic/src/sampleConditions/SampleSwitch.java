package sampleConditions;

public class SampleSwitch {
/**
 * @param args
 */
public static void main(String[] args) {
	System.out.println("★★★ switch文（int型変数の判定）★★★");
	int i = 2;

	switch(i) {
	case 1: System.out.println("The value for i is:" + i);
	break;
	case 2: System.out.println("The value for i is:" + i);
	break;
	case 3: System.out.println("The value for i is:" + i);
	break;
	default: System.out.println("Default action" );
	}

	System.out.println("★★★ switch文（String型変数の判定）★★★");
	String str = "AAA";

	switch(str) {
	case "AAA": System.out.println("The value for str is: " + str);
	break;
	case "BBB": System.out.println("The value for str is: " + str);
	break;
	case "CCC": System.out.println("The value for str is: " + str);
	break;
	default: System.out.println("Default action");
	}
}
}
