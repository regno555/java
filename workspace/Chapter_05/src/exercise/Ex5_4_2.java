package exercise;

import lib.Input;

public class Ex5_4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double v1, v2;
		v1 = Input.getDouble("V1");
		v2 = Input.getDouble("V2");
		System.out.printf("比率は、%6.2fパーセントです。", 100 * v1 / v2);
	}

}
