package practice13.common;


public class Item {
	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */
	private String name;
	private int additionalDamage;

	public Item(String name, int damage){
		this.name = name;
		this.additionalDamage = damage;
	}

	public String getName() {
		return this.name;
	}
	public int getAdditionalDamage() {
		return this.additionalDamage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdditioanlDamage(int damage) {
		this.additionalDamage = damage;
	}

}
