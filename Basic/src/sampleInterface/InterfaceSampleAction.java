package sampleInterface;

import java.util.ArrayList;

/**
 * Java入門コースインターフェース説明クラス.
 */
public class InterfaceSampleAction {

	public static void main(String[] args) {

		InterfaceSample_USB usb
			= new InterfaceSample_USB();		// USBクラス
		InterfaceSample_Lightning lightning
			= new InterfaceSample_Lightning();	// Lightningクラス

		// USB、LightningクラスはDataInterfaceという規格のためArrayListに格納できる
		ArrayList<DataInterface> list = new ArrayList<DataInterface>();
		list.add(usb);
		list.add(lightning);

		// 拡張for文で処理
		int counter = 1;
		for(DataInterface in : list) {

			// dataInメソッド、dataOutメソッドは同じ規格のため呼び出し元はクラスを意識しなくて良い
			System.out.println("★★★ 拡張for文" + (counter++) + "回目の処理 ★★★");
			in.dataIn("アンドロイド的な");
			System.out.println(in.dataOut());
		}

		// もう一度同じ処理を実行
		for(DataInterface in : list) {

			System.out.println("★★★ 拡張for文" + (counter++) + "回目の処理 ★★★");
			in.dataIn("りんごのアレ");
			System.out.println(in.dataOut());
		}
	}
}