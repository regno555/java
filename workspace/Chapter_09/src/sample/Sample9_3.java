package sample;
import lib.Input;

public class Sample9_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String name1 = Input.getString("���O1 = ");
		String name2 = Input.getString("���O2 = ");
		if(name1.equals(name2)){
			System.out.println("�������O�ł��B");
		}else{
			System.out.println("�Ⴄ���O�ł��B");
		}
	}

}
