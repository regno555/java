package sample;
import lib.Input;

public class Sample10_7 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int data, total = 0;
		while((data = Input.getInt("���̐�����͂��č��v�����߂܂��B ���̐������ = ")) != 0){
			if(data < 0){
				System.out.println("continue");
				continue;
			}
			total += data;
		}
		System.out.println("���̐��̍��v = " + total);
	}

}