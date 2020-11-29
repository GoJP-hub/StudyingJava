package sampleLoop;

public class SampleDoWhile {
	public static void main(String[] args) {
		// boolean配列の値を代入
		boolean[] array = new boolean[4];
		array[0] = false;
		array[1] = true;
		array[2] = false;
		array[3] = true;

		int counter = 0; // 配列の要素取得用カウンタ
		boolean flg = true; // while文の処理判定用フラグ

		//Do while
		//does a process once, but second loop doesn't get triggered due to first being false
		do {
			flg = array[counter];
			System.out.println("Current counter is: " + counter);
			System.out.println("Current flg is: " + flg);

			counter++;
		} while (flg);

		//second sample DoWhile
		do {

			System.out.println("★★★　do-while文（2回目）スタート　★★★");
		} while (flg);
	}
}
