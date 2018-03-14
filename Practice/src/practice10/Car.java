package practice10;

import java.util.Random;
public class Car {

	public int serialNo;
	public String color;
	public int gasoline;


	public int run(){

		this.gasoline --;

		if(this.gasoline < 0) {
			return -1;
		}

		Random rnd = new Random();

		int num = rnd.nextInt(15) + 1;

		return num;



	}




}
