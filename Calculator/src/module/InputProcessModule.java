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
		boolean equationFlg = false;

		//branch feature/./6
		//variable for error handling
		String msg = "";

		while (true) {

			try {
				if (mode == 1) {
					//branch feature/./6
					//added a flexibility to return back if error
					System.out.println(msg + "Please type number");
					consoleKey = br.readLine();
					System.out.println("Inserted value is: " + consoleKey);

					//branch feature/./6
					//Assertion on the inserted value
					try {
						checkNum(consoleKey);
					}catch(NumberFormatException e){
						msg = "Invalid value.";
						continue;
					}

					mode = 2;
					msg = "";
				} else if (mode == 2) {
					//branch feature/./6
					//added a flexibility to return back if error
					System.out.println(msg + "Please type key");
					consoleKey = br.readLine();
					System.out.println("Inserted key is: " + consoleKey);

					//branch feature/./5
					//Assertion on the key: equal
					equationFlg = checkKey(consoleKey);

					//branch feature/./6
					//Assertion on the key: +, -, *, /
					if(checkKey(consoleKey, equationFlg)) {
						msg = "Invalid value.";
						continue;
					}
					mode = 1;
					msg = "";
				}

				list.add(consoleKey);

				if (equationFlg) {
					break;
				}
			} catch (IOException e) {
				//branch feature/./6
				//if error is found, exit
				System.exit(0);
			}
		}
		return list;
	}

	//branch feature/./5
	//added assertion to check whether it is equal
	public boolean checkKey(String consoleKey) {
		boolean checkEqual = false;
		switch (consoleKey) {
		case "=":
			checkEqual = true;
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			break;
		default:
			System.out.println("please enter the key: +, -, *, /, =");
		}
		return checkEqual;
	}

	//branch feature/./6
	//for more assertion and error handling; Number
	public boolean checkNum(String consoleKey) throws NumberFormatException {
		Integer.parseInt(consoleKey);
		return true;
	}

	//branch feature/./6
	//for more assertion and error handling: Equation key (distinguished by usage of flg)
	public boolean checkKey(String consoleKey, boolean equationFlg) {
		boolean checkEquation = false;

		if(!equationFlg) {
			switch(consoleKey) {
			case "+":
			case "-":
			case "*":
			case "/":
				break;
				default:
					checkEquation = true;
			}
		}
		return checkEquation;
	}
}
