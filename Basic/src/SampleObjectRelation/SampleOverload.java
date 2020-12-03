package SampleObjectRelation;

public class SampleOverload extends ExOverLoad {
	public static void main(String[] args) {

		SampleOverload sample = new SampleOverload();

		sample.output(); // 親クラスのメソッド
		sample.output("schoo"); // 子クラスのメソッド
		sample.output("schoo", 100); // 子クラスのメソッド
		sample.output(100, "schoo"); // 子クラスのメソッド
	}

	/**
	 * 引数で取得した文字列を取得しコンソールに出力します.
	 * @param str
	 */
	public void output(String str) {
		System.out.println("output(String str)メソッドの出力結果：" + str);
	}

	/**
	 * 引数で取得した文字列と数値を取得しコンソールに出力します.
	 * @param str
	 * @param i
	 */
	public void output(String str, int i) {
		System.out.println("output(String str, int i)メソッドの出力結果：" + str + i);
	}

	/**
	 * 引数で取得した文字列と数値を取得しコンソールに出力します.
	 * @param i
	 * @param str
	 */
	public void output(int i, String str) {
		System.out.println("output(int i, String str)メソッドの出力結果：" + i + str);
	}
}

/**
 * 継承サンプルクラス.
 */
class ExOverLoad {

	/**
	 * 特定の文字列をコンソールに出力します.
	 */
	public void output() {
		System.out.println("output()メソッドの出力結果：schoo");
	}
}