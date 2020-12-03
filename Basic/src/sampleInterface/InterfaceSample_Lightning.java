package sampleInterface;

/**
 * Java入門コースインターフェース説明クラス.<br>
 * Lightningクラス
 */
public class InterfaceSample_Lightning implements DataInterface, ChageInterface {

	private String  data   = "";	// データ格納用変数
	private boolean isReal = false;	// 判定フラグ

	/**
	 * データ入力処理.<br>
	 * 入力データから端末を判定します.
	 */
	@Override
	public void dataIn(String data) {

		if("りんごのアレ".equals(data)) {

			// データがりんごのアレであればフラグをtrueにした後変数に格納
			isReal   = true;
			this.data= data;

		} else {

			// データがりんごのアレでなければフラグをfalseにして変数を初期化
			isReal    = false;
			this.data = "";
			System.out.println("認証できませんでした.");
		}
	}

	/**
	 * データ出力処理.<br>
	 * 端末が認証されていないとnullが返却されます.
	 */
	@Override
	public String dataOut() {

		if(isReal) {
			// 認証済み端末であればデータを返却
			return this.data;
		}

		// 認証されていなければnullを返却
		return null;
	}

	/**
	 * 充電処理メソッドです.
	 */
	@Override
	public void chage() {
		System.out.println("充電中...");
	}
}