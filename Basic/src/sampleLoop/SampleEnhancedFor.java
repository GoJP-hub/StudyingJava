package sampleLoop;

import java.util.ArrayList;

public class SampleEnhancedFor {
	public static void main(String[] args) {
		String[] array = new String[4];
		array[0] = "schoo ";
		array[1] = "WEB";
		array[2] = "-";
		array[3] = "campus";

		System.out.println("★★★　EnhancedFor(1)：Getting factor of ArrayList★★★");

		String str1 = "";
		ArrayList<String> list = new ArrayList<String>();

		// 拡張for文で配列の内容を順番に処理
		for (String element1 : array) {
			str1 = str1 + element1;
			System.out.println("変数str1の値は「" + str1 + "」です");

			list.add(element1);
		}

		System.out.println("★★★EnhancedFor(2)：Getting factor for Collection★★★");

		String str2 = "";

		// 拡張for文でリストの内容を順番に処理
		for(String element2 : list) {
			str2 = str2 + element2;
			System.out.println("変数str2の値は「" + str2 + "」です");
		}
	}
}
