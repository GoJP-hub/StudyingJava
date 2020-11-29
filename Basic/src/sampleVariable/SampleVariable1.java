package sampleVariable;

public class SampleVariable1 {
public static void main(String[] args) {
	String str = "schoo";	// 文字列
	char ch	= 's';	// 文字
	int	 i	= 100;	// 整数
	float f = 3.14F;// 実数

	// 変数の内容を出力
	System.out.println("文字列：" + str);
	System.out.println("文字：" + ch);
	System.out.println("整数：" + i);
	System.out.println("実数：" + f);

	//変数のカウント
	int count = str.length();
	System.out.println("the number for str is: " + count);
}
}
