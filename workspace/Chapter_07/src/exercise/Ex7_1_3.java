package exercise;
import java.time.LocalDate;

import lib.Input;

public class Ex7_1_3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String str = Input.getString("���t [XXXX-XX-XX] = ");
		LocalDate date = LocalDate.parse(str);
		System.out.println("���t = " + date);
	}

}
