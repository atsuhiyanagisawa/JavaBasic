/*
 * PTra13_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_03 extends practice13.common.Slime{

	/*
	 * ★ common.Characterクラスを継承した、common.Slimeクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（10, 5, 2）
	 */

	public static void main(String[] args) {
		// ★ common.Slimeクラスをインスンタンス化してください
		PTra13_03 pra13 = new PTra13_03();

		// ★ common.Slimeインスタンスのnameに"スライム"を設定して下さい

		pra13.setName("スライム");


		// ★ common.Slimeインスタンスのキャラクター情報を表示してください

		System.out.println(pra13.showParameter());
	}
}
