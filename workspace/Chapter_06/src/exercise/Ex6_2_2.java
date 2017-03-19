package exercise;

import lib.Input;

public class Ex6_2_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a = Input.getDouble("A = ");
		double b = Input.getDouble("B = ");
		double c = Math.sqrt((a * a + b * b));
		
		System.out.print("a = " + a + "\n" + "b = " + b + "\n" + "C = " + c);
	}

}
