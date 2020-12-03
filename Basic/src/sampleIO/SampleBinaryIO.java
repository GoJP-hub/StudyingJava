package sampleIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleBinaryIO {
	public static void main(String[] args) {
		//variable for path
		String input = "C:\\Users\\gohir\\iCloudDrive\\PJ_DevSkill\\Java\\05. TestAssets\\StudyingJava\\Basic\\Data\\Input\\schoo_logo.png";
		String output = "C:\\Users\\gohir\\iCloudDrive\\PJ_DevSkill\\Java\\05. TestAssets\\StudyingJava\\Basic\\Data\\Output\\schoo_logo2.png";

		//instances for getting the input
		File inputFile = null;
		FileInputStream fiStream = null;

		//instance for conducting output
		File outputFile = null;
		FileOutputStream foStream = null;

		//for storing binary data
		byte[] binary = null;

		try {
			System.out.println("★★★ バイト読み込みを開始します ★★★");
			inputFile = new File(input);
			fiStream = new FileInputStream(inputFile);

			binary = new byte[(int) inputFile.length()];
			fiStream.read(binary);
			System.out.println("★★★ バイト読み込みを終了します ★★★");

			System.out.println("★★★ バイト書き込みを開始します ★★★");
			outputFile = new File(output );
			foStream = new FileOutputStream(outputFile);

			foStream.write(binary);
			foStream.flush();
			System.out.println("★★★ バイト書き込みを終了します ★★★");

		} catch (FileNotFoundException e) {
			System.out.println("Error at Output");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error at Output");
			e.printStackTrace();
		} finally {
			try {
				if (fiStream != null) {
					fiStream.close();
				}
				if (foStream != null) {
					foStream.flush();
				}
			} catch (IOException e) {
				System.out.println("Error at the end");
				e.printStackTrace();
			}
		}
	}
}
