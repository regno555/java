package exercise;
import lib.Input;

public class Ex10_2_1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String str = "";
		while((str = Input.getString("���������� = ")) != null){
			System.out.println("������ = " + str + " : ������ = " + str.length());
		}
	}

}
