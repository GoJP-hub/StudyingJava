package sampleString;

public class sampleString {
	public static void main(String[] args) {
		sampleString str = new sampleString();

		str.outString();

		str.outString("Works out well");
	}

	public void outString() {
		System.out.println("Testing");
	}

	public void outString(String string) {
		System.out.println("Testing: " + string);
	}
}