package lib;
import exercise.Ex11_3_1_Health;

public class Ex11_3_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double weight, height;
		weight = Input.getDouble("�̏d����� = ");
		height = Input.getDouble("�g������� = ");
		System.out.printf("BMI = %4.1f",  Ex11_3_1_Health.bimValue(weight, height));
	}

}