package exercise;
import lib.Input;

public class Ex6_5_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String str = Input.getString("������ = ");
		int len = str.length();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(len - 1);
		System.out.print("������ = " + len + "\n");
		System.out.print("�擪���� = " + ch1 + "\n" + "�������� = " + ch2);
	}

}
