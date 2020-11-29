package sampleConstant;

public class SampleConstant {
	//By adding "final", it becomes constant. this cannot be edited
	public static final String url = "https://schoo.jp/";

	public static void main(String[] args) {
		System.out.println("learning platform for basic programming is "
				+ url);

		//error because url is constant
		//		url = "changed";

	}
}
