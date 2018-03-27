/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;
public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		SuperHero superHero = 	new SuperHero();
		Slime slime = new Slime();
		superHero.setName("勇者（装備あり）");
		slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
		Item item = new Item("こんぼう", 4);

		// ★ 作成したItemインスタンスをSuperHeroに持たせてください

		superHero.setEquipment(item);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		boolean winHero = true;
		while(winHero) {
			System.out.println(superHero.getName() + "の攻撃！");
			int damage = superHero.attack();
			if(slime.damage(damage)) {
				System.out.println(slime.getName() + "は倒れた");
				break;
			}

			System.out.println(slime.getName() + "の攻撃");
			int damage2 = slime.attack();
			if(superHero.damage(damage2)) {
				System.out.println(superHero.getName() + "は倒れた");
				winHero = false;
				break;
			}
		}

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		if(winHero) {
			System.out.println(superHero.getName() + "は" + slime.getName() + "との戦いに勝利した");
		}else{
			System.out.println(slime.getName() + "は" + superHero.getName() + "との戦いに勝利した");
		}
	}
}
