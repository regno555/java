package exercise;
import lib.Input;

public class Ex5_2_1A {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double eigo, suugaku, kokugo, total, heikin;
		
		eigo = Input.getDouble("�p��");
		suugaku = Input.getDouble("���w");
		kokugo = Input.getDouble("����");
		
		total = eigo + suugaku + kokugo;
		heikin = total / 3;
		
		System.out.println("���v�_ = " + total);
		System.out.println("���ϓ_ = " + heikin);
		
	}

}
