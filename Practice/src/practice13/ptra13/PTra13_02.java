/*
 * PTra13_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_02 extends practice13.common.Hero{

	/*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */

	public static void main(String[] args) {
		// ★ common.Heroクラスをインスンタンス化してください
		PTra13_02 pra13 = new PTra13_02();

		// ★ common.Heroインスタンスのnameに"勇者"を設定して下さい
		pra13.setName("勇者");


		// ★ common.Heroインスタンスのキャラクター情報を表示してください
		System.out.println(pra13.showParameter());
	}
}
