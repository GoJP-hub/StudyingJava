package module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputProcessModule {
	public ArrayList<String> keyInput() {
		//キーボードの受付準備
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		//変数各種
		ArrayList<String> list = new ArrayList<String>();
		String str = "";

		//キーボードの受付-現段階では、Breakで無限ループを離脱
		while (true) {
			System.out.println("Please type number");

			try {
				//記入事項をstr変数に格納
				str = br.readLine();
				System.out.println("Inserted value is: " + str);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		}
		return list;
	}
}
