package exercise;
import lib.Input;

public class Ex10_1_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int datacount = 0;
		double data = 0;
		double total = 0;
		while((data = Input.getDouble("�f�[�^���� = ")) != 0){
			total += data;
			++datacount;
		}
		System.out.println("���͌��� = " + datacount);
		System.out.println("���͍��v = " + total);
	}

}
