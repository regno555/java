package sample;
import lib.Input;

public class Sample10_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int total = 0, data;
		while((data = Input.getInt("�������� = ")) != 0){
			total += data;
		}
		System.out.println("���v = " + total);
	}

}
