package exercise;

import lib.Input;

public class Ex6_3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a = Input.getDouble("a =");
		double ans1 = Math.pow(a, 2);
		double ans2 = Math.pow(a, 3);
		double ans3 = Math.pow(a, 4);
		System.out.printf("2乗 = %10.5f \t 3乗 = %10.5f \t 4乗 = %10.5f", ans1, ans2, ans3);
	}

}
