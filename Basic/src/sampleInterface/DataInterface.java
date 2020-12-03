package sampleInterface;

/**
 * Java入門コースインターフェース説明.<br>
 * データ処理インターフェース
 */
public interface DataInterface {

	/**
	 * データ入力のためのメソッドです.
	 * @param data 入力データ
	 */
	public void dataIn(String data);

	/**
	 * データ出力のためのメソッドです.
	 * @return 出力データ
	 */
	public String dataOut();
}