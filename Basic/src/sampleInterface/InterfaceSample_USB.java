package sampleInterface;

/**
 * Java入門コースインターフェース説明クラス.<br>
 * USBクラス
 */
public class InterfaceSample_USB implements DataInterface {

	private String data = "";	// データ格納用変数

	/**
	 * データ入力処理.
	 */
	@Override
	public void dataIn(String data) {
		this.data = data;
	}

	/**
	 * データ出力処理.
	 */
	@Override
	public String dataOut() {
		return this.data;
	}
}