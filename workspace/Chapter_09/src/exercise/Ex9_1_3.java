package exercise;
import lib.Input;

public class Ex9_1_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int n1 = Input.getInt("����n1����� = ");
		int n2 = Input.getInt("����n2����� = ");
		if (n1 >= n2){
			System.out.println("�傫���i�����ꍇ�܂ށj�l�́A = " + n1);
		}else{
			System.out.println("�傫���l�́A = " + n2);
		}
	}

}
