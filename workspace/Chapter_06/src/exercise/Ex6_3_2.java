package exercise;

import lib.Input;

public class Ex6_3_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double a = Input.getDouble("A = ");
		double b = Input.getDouble("B = ");
		double c = Input.getDouble("C = ");
		double max = Math.max(a, Math.max(b, c));
		System.out.print("�ő�l = " + max);
	}

}
