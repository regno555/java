package exercise;

import lib.Input;

public class Ex6_2_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double a = Input.getDouble("A = ");
		double b = Input.getDouble("B = ");
		double c = Math.sqrt((a * a + b * b));
		
		System.out.print("a = " + a + "\n" + "b = " + b + "\n" + "C = " + c);
	}

}
