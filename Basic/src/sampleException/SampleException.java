package sampleException;

//import did not work smoothly. try shortcut "ctrl/shift/o to check imports"
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleException {
	public static void main(String[] args) {
		SampleException sample = new SampleException();

		//Pattern with Throw
		//Needs to do try catch when calling the method
		try {
			sample.throwSample();

			//will not be called because error causes to skip to error handling method
			System.out.println("Error is not handled at the called method");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error is processed at try-catch from method caller side");
		}finally {
			System.out.println("Finally statement is always process at the end of try-catch");
		}

		//Pattern with tryCatch
		sample.tryCatchSample();
	}

public void throwSample() throws FileNotFoundException{
	//specify the file to read
	String filePath = "";

	//read the file
	File dummyFile = new File(filePath);
	FileReader fr = new FileReader(dummyFile);

	//will not be called because error causes to skip to error handling method
	System.out.println("Error is not handled at the called method");
}

public void tryCatchSample() {
	try {
		//specify the file to read
		String filePath = "";

		//read the file
		File dummyFile = new File(filePath);
		FileReader fr = new FileReader(dummyFile);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("Error is processed at the called method itself");
	}
}
}
