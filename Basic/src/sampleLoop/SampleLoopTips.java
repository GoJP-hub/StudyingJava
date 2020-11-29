package sampleLoop;

public class SampleLoopTips {
public static void main(String[] args) {
	//example break
	System.out.println("★★★　Break：Force quite the loop★★★");
	while(true) {
		System.out.println("Message from infinite loop");
		break;
	}

	//example continue
	System.out.println("★★★　continue：Return to head of loop★★★");
	for(int count = 0; count < 5; count ++) {
		System.out.println("This is count:" + count) ;

		//wrap "Continue" with if statement
		if(true) {
			continue;
		}

		//below does not get called
		System.out.println("★★★ この処理は実行されません ★★★");
	}

	//example break
	System.out.println("★★★　Multiple Loop：Setting loop within a loop★★★");
	// 2重配列の作成
	String[][] array1 = new String[2][];
	array1[0] = new String[2];
	array1[1] = new String[2];

	// 1つ目の配列に値を代入
	array1[0][0] = "schoo ";
	array1[0][1] = "WEB-campus ";
	// 2つ目の配列に値を代入
	array1[1][0] = "Java入門コース ";
	array1[1][1] = "開講中！！";

	String str   = "";

	// 配列の処理
	for(int i = 0; i < array1.length; i++) {

		// 配列を取得
		String[] array2 = array1[i];

		for(int j = 0; j < array2.length; j++) {

			// 配列の中の文字列を取得して結合
			str = str + array2[j];
		}
	}

	// 結合した文字列を出力
	System.out.println(str);
	// ★★★ 多重ループサンプル ここまで ★★★
}


}
