package exercise;
import lib.Input;

public class Ex9_3_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int kokugo = Input.getInt("����̓_������� = ");
		int suugaku = Input.getInt("���w�̓_������� = ");
		
		if((kokugo >= 80) || (suugaku >= 80)){
			System.out.println("���i");
		}else{
			System.out.println("�s���i");
		}
	}

}
