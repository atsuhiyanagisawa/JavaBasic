package practice13.common;
public class Hero extends Character{
	/*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */
	private int hp = 25;
	private int power = 10;
	private int endurance = 7;

	//s and g
	public void setHp(int a) {
		this.hp = a;
	}
	public void setPower(int a) {
		this.power = a;
	}
	public void setEndurance(int a) {
		this.endurance = a;
	}

	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public int getEndurance() {
		return this.endurance;
	}


	public static void main(String[] args) {

	}


}
