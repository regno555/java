package exercise;

import java.time.LocalDate;

public class Ex11_3_4 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		LocalDate today = LocalDate.now();
		String youbi_mei = Ex11_3_4_Hizuke.youbi(today);
		System.out.println("���t = " + today + " �j�� = " + youbi_mei);
	}

}
