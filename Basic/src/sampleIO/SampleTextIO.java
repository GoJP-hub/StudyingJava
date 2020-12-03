package sampleIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SampleTextIO {
	public static void main(String[] args) {
		//Path locations
		String inputPath = "C:\\Users\\gohir\\iCloudDrive\\PJ_DevSkill\\Java\\05. TestAssets\\StudyingJava\\Basic\\Data\\Input\\";
		String outputPath = "C:\\Users\\gohir\\iCloudDrive\\PJ_DevSkill\\Java\\05. TestAssets\\StudyingJava\\Basic\\Data\\Output\\";
		String fileName = "SampleText.txt";

		//Method for input(=reading the file)
		File inputFile = null;
		FileReader fr = null;
		BufferedReader br = null;

		//Method for output(=writing the file)
		File outputFile = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		//Method to specify and run IO activity
		try {
			System.out.println("★★★ テキスト読み込みを開始します ★★★");
			inputFile = new File(inputPath + fileName);
			fr = new FileReader(inputFile);
			br = new BufferedReader(fr);

			outputFile = new File(outputPath + fileName);
			fw = new FileWriter(outputFile);
			bw = new BufferedWriter(fw);
			String line;

			System.out.println("★★★ テキスト書き込みを開始します ★★★");
			while ((line = br.readLine()) != null) {
				bw.write(line);
				System.out.println("入出力した文字列は「" + line + "」です");
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (fw != null) {
					fw.close();
				}
				if (br != null) {
					br.close();
				}
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
