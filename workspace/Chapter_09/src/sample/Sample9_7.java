package sample;

import lib.Input;

public class Sample9_7 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int error = Input.getInt("�G���[�R�[�h�ԍ� = ");
		switch(error){
		case 401:
			System.out.println("Bad Request");
			break;
		case 403:
			System.out.println("Forbidden");
			break;
		case 500:
			System.out.println("Internal Server Error");
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
