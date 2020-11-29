package sampleLoop;

public class SampleWhile {
	public static void main(String[] args) {
		boolean[] array = new boolean[4];
		array[0] = true;
		array[1] = true;
		array[2] = false;
		array[3] = true;

		int counter = 0;
		boolean flg = true;

		//while statement
		while (flg) { //while they are true
			flg = array[counter];
			System.out.println("The value for counter is: " + counter);
			System.out.println("The value for flg is: " + flg);

			counter++;
		}

		//below statement is not triggered because while loop is occuring at above
		while (flg) {

			System.out.println("★★★　while文（2回目）スタート　★★★");
		}

	}
}
