package sample;
import lib.Input;

public class Sample10_2 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String str, result = "";
		while((str = Input.getString()) != null){
			result += str;
		}
		System.out.println("�A������������ = " + result);
	}

}
