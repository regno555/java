package exercise;
import lib.Input;

public class Ex9_4_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String word = Input.getStr("�P������ = ");
		if(word.equals("�v���p�[")){
			System.out.println("�e�󂯉��");
		}else if(word.equals("�Ղ�Ղ�")){
			System.out.println("C++����");
		}else if(word.equals("�Ȃ��")){
			System.out.println("@");
		}else{
			System.out.println("???");
		}
	}

}
