package exercise;

public class Ex8_5_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double [] temp = {7.2, 5.2, 11.5, 18.5, 25.6};
		double total = 0;
		for (int i = 0; i < temp.length; i++){
			total += temp[i];
		}
		System.out.println("���ϋC�� = " + total / temp.length + "�x");
	}

}
