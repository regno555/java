package exercise;

public class Ex8_5_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int [] kokugo = {88, 58, 63, 95, 77};
		int total = 0;
		for (int i = 0; i < kokugo.length; i++){
			total += kokugo[i];
		}
		for (int i = 0; i < kokugo.length; i++){
			System.out.println("�_�� = " + kokugo[i]);
		}
		System.out.println("���v = " + total);
		System.out.println("���� = " + total / kokugo.length);
	}

}