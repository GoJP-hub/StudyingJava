package SampleObjectRelation;

public class SampleCapsule {
	public static void main(String[] args) {

		MyNumber1 num1 = new MyNumber1();
		MyNumber2 num2 = new MyNumber2();

		// マイナンバーを書き換え
		num1.num = "00000";
		// マイナンバーを書き換え
		// こちらは変数numがprivateになっているので書き換えできません
//		num2.num = "00000";

		System.out.println(num1.getNumber());
		System.out.println(num2.getNumber());
	}
}
/**
 * マイナンバークラス.<br>
 * 変数numにアクセスできてしまうため書き換えられてしまう可能性がある.
 */
class MyNumber1 {

	String num = "12345";	// マイナンバー（仮）

	/**
	 * マイナンバーを返却します.
	 * @return マイナンバー
	 */
	public String getNumber() {
		return num;
	}
}

/**
 * マイナンバークラス.<br>
 * 変数numがprivateになっているためアクセスすることができない.
 */
class MyNumber2 {

	private String num = "12345";	// マイナンバー（仮）

	/**
	 * マイナンバーを返却します.
	 * @return マイナンバー
	 */
	public String getNumber() {
		return num;
	}
}