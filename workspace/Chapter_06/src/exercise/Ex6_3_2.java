package exercise;

import lib.Input;

public class Ex6_3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a = Input.getDouble("A = ");
		double b = Input.getDouble("B = ");
		double c = Input.getDouble("C = ");
		double max = Math.max(a, Math.max(b, c));
		System.out.print("最大値 = " + max);
	}

}
