package sample;
import lib.Input;

public class Sample9_5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int n = Input.getInt("���l����� = ");
		if((n <= 100) && (n%8 == 0)){
			System.out.println(n + "�́A100�ȉ���8�̔{���ł��B");
		}else{
			System.out.println(n + "�́A100�ȉ���8�̔{���łȂ��ł��B");
		}
	}

}
