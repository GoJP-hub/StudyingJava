package SampleObjectRelation;

public class SampleExtends extends SuperSample {
	/**
	 * コンストラクタ.<br>
	 * インスタンス生成時に親クラスへ文字列を格納します.
	 * @param str outputメソッドで出力する文字列
	 */
	public SampleExtends(String str) {
		//親クラス（SuperSampleクラス）のコンストラクタを呼び出し
		super(str);
		super.output();
	}

	/**
	 * 足し算をして結果を出力します.
	 * @param i1
	 * @param i2
	 */
	public void calc(int i1, int i2) {
		System.out.println("計算結果：" + (i1 + i2));
	}

	public static void main(String[] args) {

		// ExtendsSampleクラスのインスタンスを生成
		SampleExtends ex = new SampleExtends("schoo");
		// 親クラスのメソッドを実行
		ex.output();
		// 子クラスのメソッドを実行
		ex.calc(10, 90);
	}
}

/**
 * 本クラスを親クラスとして継承します.
 */
class SuperSample {

	private String str = "";

	/**
	 * SuperSampleクラスのコンストラクタ.<br>
	 * インスタンス作成時に呼び出されます.
	 * @param str インスタンスに格納する文字列
	 */
	public SuperSample(String str) {
		this.str = str;
	}

	/**
	 * デフォルトコンストラクタ.<br>
	 * 必ず引数付きのコンストラクタを使用したいのでprivateにしています.
	 */
	@SuppressWarnings("unused")
	private SuperSample() {
	}

	/**
	 * 標準出力メソッド.<br>
	 * インスタンス生成時に格納された文字列をコンソールに出力します.
	 */
	public void output() {
		System.out.println(this.str);
	}
}