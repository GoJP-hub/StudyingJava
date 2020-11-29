package sampleLoop;

public class SampleForLoop {
	public static void main(String[] args) {
		String[] array = new String[5];
		array[0] = "schoo";
		array[1] = " ";
		array[2] = "WEB";
		array[3] = "-";
		array[4] = "campus";

		System.out.println("★★★　配列の処理(1)：配列の内容を取得(要素数を指定)　★★★");

		String str = "";

		//for loop
		for (int count = 0; count < 5; count++) {
			str = str + array[count];
			System.out.println("The current count is: " + count);
			System.out.println("The value for str is: " + str);
		}

		//For loop based on number of values in List
		System.out.println("★★★　配列の処理(2)：配列の内容を取得(要素数は配列のサイズから取得)　★★★");
		String str2 = "";
		System.out.println("After ForLoop ends, the value for str is:" + str);
		for (int count = 0; count < 5; count++) {
			str2 = str2 + array[count];
			System.out.println("The current count is: " + count);
			System.out.println("The value for str is: " + str2);
		}

		System.out.println("After ForLoop ends, the value for str is:" + str);

	}
}
