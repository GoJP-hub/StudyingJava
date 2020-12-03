package sampleIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//branch feature/./7
//How to get input from the console
public class SampleInputStreamReader {
	public static void main(String[] args) {
		SampleInputStreamReader IO = new SampleInputStreamReader();

		//prepare instances to accept keyboard insertion (to console)
		//#1: System.in = accepts input, stores the (binary) data, and output when trigger
		//#2: InputStreamReader= converts the inserted data into String
		//#3: BufferedReader = reads the String data
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		//prepare the variables
		ArrayList<String> list = new ArrayList<>();
		String consoleKey = "";
		String msg = "";

		while(true) {
			System.out.println(msg + "Please insert value. To exit, please enter = to exit");
			try {
				consoleKey = br.readLine();
			}catch (IOException e) {
				msg = "IO Exception. ";
				continue;
			}
			System.out.println("Inserted value is: " + consoleKey);

			list.add(consoleKey);

			if(IO.checkEqual(consoleKey)) {
				break;
			}
		}
	}
	public boolean checkEqual(String consoleKey) {
		boolean checkEqual = false;

		switch(consoleKey) {
		case "=":
			checkEqual = true;
			break;
		default:
			break;
		}
		return checkEqual;
	}



}
