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

		//branch feature/./5
		//designed to insert number first, then keys by conditioning
		String consoleKey = "";
		int mode = 1;
		boolean equalFlg = false;

		while (true) {

			try {
				if(mode == 1) {
					System.out.println("Please type number");
					consoleKey = br.readLine();
					System.out.println("Inserted value is: " + consoleKey);

					mode = 2;
				}else if(mode == 2) {

					System.out.println("Please type key");
					consoleKey = br.readLine();
					System.out.println("Inserted key is: " + consoleKey);

					equalFlg = checkKey(consoleKey);

					mode = 1;
				}

				list.add(consoleKey);

				if(equalFlg) {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	//branch feature/./5
	//added assertion to check whether it is equal
	public boolean checkKey(String key) {
		boolean checkFlg = false;
		switch (key) {
		case "=":
			checkFlg = true;
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			break;
		default:
			System.out.println("please enter the key: +, -, *, /, =");
		}
		return checkFlg;
	}
}
