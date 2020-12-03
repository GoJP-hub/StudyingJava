package SampleObjectRelation;

public class SampleOverride extends ExOverRide{
	public static void main(String[] args) {

		ExOverRide exor = new ExOverRide(); // 親クラス
		SampleOverride ors = new SampleOverride(); // 子クラス

		// 親クラスのoutputメソッドを実行
		exor.output();
		// 子クラスのoutputメソッドを実行
		ors.output();
	}

	/**
	 * 特定の文字列をコンソールに出力します.
	 */
	@Override
	public void output() {
		System.out.println("schoo WEB-campus");
	}

}

/**
 * 継承サンプルクラス.
 */
class ExOverRide {

	/**
	 * 特定の文字列をコンソールに出力します.
	 */
	public void output() {
		System.out.println("school");
	}

}