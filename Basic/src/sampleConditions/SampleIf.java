package sampleConditions;

import java.util.ArrayList;

public class SampleIf {
	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "sample1";
		array[1] = "sample2";
		array[2] = "sample3";

		String str1 = "sample2";

		//If statement
		System.out.println("★★★ if文で文字列を検索します ★★★");

		// if文で文字列を検索
		// equalsメソッドは文字列を比較して同じであればtrue、異なればfalseを返します
		if (str1.equals(array[0])) {
			System.out.println("First item on array is: " + str1);
		}

		if (str1.equals(array[1])) {
			System.out.println("Second item on array is: " + str1);
		}

		if (str1.equals(array[2])) {
			System.out.println("Third item on array is: " + str1);
		} else {
			System.out.println("No value matched from variable array");
		}

		//If and For
		String str2 = "sample3";
		ArrayList<String> list = new ArrayList<>();

		System.out.println("★★★ for文とif文を組み合わせて文字列を検索します ★★★");

		for (int i = 0; i < array.length; i++) {
			if (str2.equals(array[i])) {
				System.out.println(i + "th value is: " + str2);
			}
			list.add(array[i]);
		}

		//If statement with ArrayList
		System.out.println("★★★ ArrayListとif文、else文で文字列を検索します ★★★");

		if (list.isEmpty()) {
			System.out.println("No value found in ArrrayList list");
		} else {
			int counter = 1;
			for (String str3 : list) {
				if ("sample1".equals(str3)) {
					System.out.println(counter + "th value is: " + str3);
				} else {
					System.out.println(counter + "th value is not: sample1");
				}
				counter++;
			}
		}

	}

}
