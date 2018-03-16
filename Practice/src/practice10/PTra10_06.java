package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car cars[];
		cars = new Car[3];

		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();

		cars[0].color = "RED";
		cars[1].color = "BLUE";
		cars[2].color = "YELLO";

		cars[0].gasoline = 100;
		cars[1].gasoline = 100;
		cars[2].gasoline = 100;


		for (int number =0;number <3;number ++) {


			final int distance = 300;

			int totalDistance = 0;

			int n = 0;//ループの回数

			for(int i = 0; i < 200; i ++) {
				n ++ ;

				int resultCarRun = cars[number].run();



				if(resultCarRun == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}


				totalDistance += resultCarRun;





				if(totalDistance >= distance) {

					System.out.println("car" + (number + 1) + "は目的地にまで" + n + "時間かかりました。残りのガソリンは、" + cars[number].gasoline + "リットルです");
					break;
				}

			}

		}


	}
}
