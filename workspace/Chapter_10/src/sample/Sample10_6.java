package sample;
import lib.Input;

public class Sample10_6 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int data, total = 0;
		while((data = Input.getInt("���l����� = ")) != 0){
			if(data < 0){
				System.out.println("break");
				break;
			}
			total += data;
		}
		System.out.println("���v = " + total);
	}

}
