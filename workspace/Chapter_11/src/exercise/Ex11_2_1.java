package exercise;

public class Ex11_2_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double weight = 0;
		double height = 0;
		weight = lib.Input.getDouble("�̏d����� = ");
		height = lib.Input.getDouble("�g������� = ");
		Ex11_2_1_Health.bmi(weight, height);
	}

}
