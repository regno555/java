package exercise;
import lib.Input;

public class Ex5_2_1B {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double height, weight;
		
		height = Input.getDouble("�g��(m)");
		weight = Input.getDouble("�̏d(kg)");
		
		System.out.println("BMI = " + (weight / (height * height)));
	}

}
