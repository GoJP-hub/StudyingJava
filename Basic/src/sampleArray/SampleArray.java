package sampleArray;

import java.util.ArrayList;
import java.util.HashMap;

public class SampleArray {
	public static void main(String[] args) {
		//array
		String[] array = new String[5];

		array[0] = "sample1";
		array[1] = "sample2";
		array[2] = "sample3";
		array[3] = "sample4";
		array[4] = "sample5";

		String str = array[3];

		System.out.println("Array Example: the value for array[3] is: " + str);

		//collection
		ArrayList<String> list = new ArrayList<String>();
		list.add("sammple1-");
		list.add("sammple2-");
		list.add("sammple3");

		String str1 = list.get(0);
		String str2 = list.get(1);
		String str3 = list.get(2);

		System.out.println("Collection example: " + str1 + str2 + str3);

		//hashmap
		HashMap<String, String> map = new HashMap<String, String>();

		// HashMapにキーと値を追加
		map.put("NAME", "schoo WEB-campus");
		map.put("URL", "https://schoo.jp/");

		// HashMapから値を取得
		String str4 = map.get("NAME");
		String str5 = map.get("URL");

		System.out.println(str4 + "のURLは" + str5);

		//Array with integer
		int[] intArray = new int[2];

		// 配列に値を代入
		intArray[0] = 10;
		intArray[1] = 20;

		// 配列の値を計算して出力
		int result = intArray[0] + intArray[1];
		System.out.println("計算結果：" + result);
	}
}
