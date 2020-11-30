package sampleConditions;

public class SampleElseIf {
public static void main(String[] args) {
	int i = 10;
	if(i<10) {
		System.out.println("The value is less than 10");
	}else if(i<20){
		System.out.println("The value is more than 10, less than 20");
	}else{
		System.out.println("The value is more than 20");
	}
}
}
