package exercise;
import lib.Input;

public class Ex5_1_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double eigo, suugaku, kokugo, total;
		
		eigo = Input.getDouble();
		suugaku = Input.getDouble();
		kokugo = Input.getDouble();
		total = eigo + suugaku + kokugo;
		
		System.out.println(total);
		System.out.println(total / 3);
		
	}

}
